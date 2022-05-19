package org.vivoweb.dspacevivo.etlexample.transformation.harvester.config;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HarvesterConfiguration {
    private static Logger logger = LoggerFactory.getLogger(HarvesterConfiguration.class);

    public static Properties getConf() throws IOException {
        Properties props = new Properties();
        String resourceName = "harvester.conf";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(resourceName);
        logger.info("Loading properties from:"+url);
        try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            props.load(resourceStream);
        }
        return props;
    }
}
