package org.vivoweb.dspacevivo.transformation.harvester;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vivoweb.dspacevivo.model.Collection;
import org.vivoweb.dspacevivo.model.Community;
import org.vivoweb.dspacevivo.model.Item;
import org.vivoweb.dspacevivo.model.Repository;
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
                count++;
                Item next = harvestItemsItr.next();
                System.out.println("new Item harvested...");
                System.out.println(" " + count);
                System.out.println(mp.writeValueAsString(next));
            }
        }
    }

    public void harvestCollection() throws JsonProcessingException {
        ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Iterator<Collection> harvestCollection = dh.harvestCollection();
        int count = 0;
        if (harvestCollection != null) {
            while (harvestCollection.hasNext()) {
                count++;
                Collection next = harvestCollection.next();
                System.out.println("new Collection harvested...");
                System.out.println(" " + count);
                System.out.println(mp.writeValueAsString(next));
            }
        }
    }

    public void harvestCommunity() throws JsonProcessingException {
        ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Iterator<Community> harvestCommunity = dh.harvestCommunity();
        int count = 0;
        if (harvestCommunity != null) {
            while (harvestCommunity.hasNext()) {
                count++;
                Community next = harvestCommunity.next();
                System.out.println("new Community harvested...");
                System.out.println(" " + count);
                System.out.println(mp.writeValueAsString(next));
            }
        }
    }

    public void harvestRepository() throws JsonProcessingException {
        ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Iterator<Repository> harvestRepository = dh.harvestRepository();
        int count = 0;
        if (harvestRepository != null) {
            while (harvestRepository.hasNext()) {
                count++;
                Repository next = harvestRepository.next();
                System.out.println("new Repository harvested...");
                System.out.println(" " + count);
                System.out.println(mp.writeValueAsString(next));
            }
        }
    }

}
