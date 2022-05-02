package org.vivoweb.dspacevivo.transformation.harvester.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HarvesterConfiguration {

    public static Properties getConf() throws IOException {
        Properties props = new Properties();
        String resourceName = "harvester.conf";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            props.load(resourceStream);
        }
        return props;
    }
}
