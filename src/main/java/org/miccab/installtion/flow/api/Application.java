package org.miccab.installtion.flow.api;

import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;

public class Application {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Application.class);

    public Application() {
        LOG.info("Starting the application");
    }

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
