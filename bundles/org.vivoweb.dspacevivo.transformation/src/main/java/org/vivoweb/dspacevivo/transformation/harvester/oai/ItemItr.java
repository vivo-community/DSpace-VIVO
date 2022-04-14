package org.vivoweb.dspacevivo.transformation.harvester.oai;

import java.io.IOException;
import java.net.URISyntaxException;
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
    if (ls != null && !ls.isEmpty()) {
      return true;
    }
    OAIPMHResponse oaipmhResponse;
    boolean hasNext = false;
    boolean iterate = false;
    if (!this.origin.isEmpty()) {
      String responseXML = null;
      do {
        try {
          responseXML = this.origin.getHttpClient().doRequest(this.origin.getBaseURI(), this.origin.getVerb(), this.origin.getSet(), this.origin.getFrom(), this.origin.getUntil(), this.origin.getMetadata(),
                  this.origin.getResumptionToken(), this.origin.getIdentifier());

          oaipmhResponse = new OAIPMHResponse(responseXML, origin.getConf());
          System.out.println("ºººººººººººººº");
          System.out.println(origin.getConf().getProperty("uriPrefix"));
          ls = oaipmhResponse.modelItemsxoai();
        } catch (Exception ex) {
          System.out.print(ex);
          return hasNext;
        }

        Optional<String> resumptionToken = oaipmhResponse.getResumptionToken();
        if (resumptionToken.isPresent() && !resumptionToken.get().isEmpty()) {
          this.origin.setResumptionToken(resumptionToken.get());
          System.out.println("******************");
          System.out.print(resumptionToken.get());
        } else {
          this.origin.setResumptionToken(null);
          this.origin.setEmpty(true);

        }

        if (!ls.isEmpty()) {
          hasNext = true;
        } else if (this.origin.getResumptionToken() != null) {
          iterate = true;
        }

      } while (iterate);

    }
    return hasNext;
  }

  @Override
  public Item next() {
    Item get = ls.get(0);
    ls.remove(get);

    return get;
  }

}
