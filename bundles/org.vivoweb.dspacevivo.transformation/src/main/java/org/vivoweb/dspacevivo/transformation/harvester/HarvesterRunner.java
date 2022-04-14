package org.vivoweb.dspacevivo.transformation.harvester;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vivoweb.dspacevivo.model.Item;
import org.vivoweb.dspacevivo.transformation.harvester.config.HarvesterConfiguration;
import org.vivoweb.dspacevivo.transformation.harvester.oai.DspaceOAI;

public class HarvesterRunner {
  private static Logger log = LoggerFactory.getLogger(HarvesterRunner.class);
  private DspaceHarvester dh = null;

  public void init() throws IOException {
    Properties conf = HarvesterConfiguration.getConf();
    switch (conf.getProperty("type")) {
      case "RESTv7":
        //dh = new Dspace7REST(conf);
        break;
      case "SPARQL":
        //dh = new SPARQLHarvester(conf);
        break;
      case "OAI":
        dh = new DspaceOAI(conf);
        break;
    }
    dh.connect();
  }

  public void harvest() throws JsonProcessingException {
    ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    Iterator<Item> harvestItemsItr = dh.harvestItems();
    int count = 0;
    if (harvestItemsItr != null) {
      while (harvestItemsItr.hasNext()) {
        count ++;
        Item next = harvestItemsItr.next();
        System.out.println("new Item harvested...");
        System.out.println(" "+count);
        System.out.println(mp.writeValueAsString(next));
      }
    }
  }
}