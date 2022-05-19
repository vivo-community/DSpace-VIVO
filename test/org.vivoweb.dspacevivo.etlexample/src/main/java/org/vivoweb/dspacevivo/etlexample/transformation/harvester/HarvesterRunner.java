package org.vivoweb.dspacevivo.etlexample.transformation.harvester;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Properties;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.sparql.SystemARQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vivoweb.dspacevivo.etlexample.transformation.harvester.config.HarvesterConfiguration;
import org.vivoweb.dspacevivo.model.Collection;
import org.vivoweb.dspacevivo.model.Community;
import org.vivoweb.dspacevivo.model.Item;
import org.vivoweb.dspacevivo.model.Repository;
import org.vivoweb.dspacevivo.model.util.DSpaceObjectMapperHelper;
import org.vivoweb.dspacevivo.transformation.DspaceItemParser;
import org.vivoweb.dspacevivo.transformation.harvester.DspaceHarvester;

import org.vivoweb.dspacevivo.transformation.harvester.oai.DspaceOAI;
import org.vivoweb.dspacevivo.transformation.harvester.restv7.RESTv7Harvester;
import org.vivoweb.dspacevivo.vocab.util.ParserHelper;

public class HarvesterRunner {

    private static final String ETL_DIR_TRANSFORM = "etl.dir.transform";
    private static final String TYPE = "type";
    private static final String ETL_DIR_EXTRACT = "etl.dir.extract";
    private static Logger logger = LoggerFactory.getLogger(HarvesterRunner.class);
    private DspaceHarvester dh = null;
    DspaceItemParser dspaceVioItemparser = null;
    private String extractDir;
    private String transformDir;
    private ObjectMapper objectMapper;


    public void init() throws IOException {
        logger.info("Creating DspaceVivoParser");
        dspaceVioItemparser = new DspaceItemParser();
        Properties conf = HarvesterConfiguration.getConf();

        switch (conf.getProperty(TYPE)) {
        case "RESTv7":
            logger.info("Connecting to REST endpoint");
            dh = new RESTv7Harvester(conf);
            break;
        case "OAI":
            logger.info("Connecting to OAI-PMH endpoint");
            dh = new DspaceOAI(conf);
            break;
        }
        setExtractDir(conf.getProperty(ETL_DIR_EXTRACT));
        setTransformDir(conf.getProperty(ETL_DIR_TRANSFORM));
        objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        dh.connect();
    }

    public void harvestItems() throws IOException {
        Iterator<Item> harvestItemsItr = dh.harvestItems();
        int count = 0;
        if (harvestItemsItr != null) {
            while (harvestItemsItr.hasNext()) {
                count++;
                Item item = harvestItemsItr.next();
                logger.info("DSpace Extraction "+count+ " ..."+item.getId());
                String itemJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);
                String extractedFileName = extractDir+"/"+item.getId().replaceAll("[^a-zA-Z0-9]", "_")+".json"; 
                String transformedFileName = transformDir+"/"+item.getId().replaceAll("[^a-zA-Z0-9]", "_")+".ntriples"; 
                logger.info("Write to "+extractedFileName); 
                Files.write(Paths.get(extractedFileName), itemJson.getBytes(StandardCharsets.UTF_8));
                logger.info("DSpace-VIVO Transformation ..."+item.getId());
                Model repoModel = dspaceVioItemparser.parse(item);
                String stringModel = ParserHelper.dumpModelNtriples(repoModel);
                Files.write(Paths.get(transformedFileName), stringModel.getBytes(StandardCharsets.UTF_8));
                logger.info(transformedFileName);
//                if (count > 50 ) {
//                    logger.info("Done!");
//                    break;
//                }
            }
        }
    }
    public void harvestCollections() throws JsonProcessingException {
        ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Iterator<Collection> harvestCollection = dh.harvestCollection();
        int count = 0;
        if (harvestCollection != null) {
            while (harvestCollection.hasNext()) {
                count++;
                Collection next = harvestCollection.next();
                logger.info("new Collection harvested...");
                logger.info(" " + count);
                logger.info(mp.writeValueAsString(next));
            }
        }
    }

    public void harvestCommunities() throws JsonProcessingException {
        ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Iterator<Community> harvestCommunity = dh.harvestCommunity();
        int count = 0;
        if (harvestCommunity != null) {
            while (harvestCommunity.hasNext()) {
                count++;
                Community next = harvestCommunity.next();
                logger.info("new Community harvested...");
                logger.info(" " + count);
                logger.info(mp.writeValueAsString(next));
            }
        }
    }

    public void harvestRepositories() throws JsonProcessingException {
        ObjectMapper mp = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Iterator<Repository> harvestRepository = dh.harvestRepository();
        int count = 0;
        if (harvestRepository != null) {
            while (harvestRepository.hasNext()) {
                count++;
                Repository next = harvestRepository.next();
                logger.info("new Repository harvested...");
                logger.info(" " + count);
                logger.info(mp.writeValueAsString(next));
            }
        }
    }

    public String getExtractDir() {
        return extractDir;
    }

    public void setExtractDir(String extractDir) {
        this.extractDir = extractDir;
    }

    public String getTransformDir() {
        return transformDir;
    }

    public void setTransformDir(String transformDir) {
        this.transformDir = transformDir;
    }

}
