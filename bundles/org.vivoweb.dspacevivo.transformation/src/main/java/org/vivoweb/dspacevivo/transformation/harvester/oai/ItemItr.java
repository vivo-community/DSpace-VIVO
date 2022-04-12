package org.vivoweb.dspacevivo.transformation.harvester.oai;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.vivoweb.dspacevivo.model.Item;

public class ItemItr implements Iterator<Item> {

  private DspaceOAI origin;
  private List<Item> ls = null;
  private Item r = null;

  public ItemItr(DspaceOAI hr) {
    this.origin = hr;
  }

  @Override
  public boolean hasNext() {
    if (ls != null) {
      Item get = ls.get(0);
      r = get;
      ls.remove(get);
      if (ls.isEmpty()) {
        ls = null;
      }
      return true;
    }
    boolean hasNext = false;
    if (!this.origin.isEmpty()) {
      String responseXML = null;
      try {
        responseXML = this.origin.getHttpClient().doRequest(this.origin.getBaseURI(), this.origin.getVerb(), this.origin.getSet(), this.origin.getFrom(), this.origin.getUntil(), this.origin.getMetadata(),
                this.origin.getResumptionToken(), this.origin.getIdentifier());
      } catch (Exception ex) {
      }
      OAIPMHResponse oaipmhResponse = new OAIPMHResponse(responseXML);
      try {
        ls = oaipmhResponse.modelItemsxoai();
      } catch (Exception ex) {
        int u = 0;
      }
      Optional<String> resumptionToken = oaipmhResponse.getResumptionToken();
      if (resumptionToken.isPresent() && !resumptionToken.get().isEmpty()) {
        this.origin.setResumptionToken(resumptionToken.get());
        hasNext = true;
      } else {
        this.origin.setResumptionToken(null);
        this.origin.setEmpty(true);
      }
    }
    return hasNext;
  }

  @Override
  public Item next() {
    return r;
  }

}
