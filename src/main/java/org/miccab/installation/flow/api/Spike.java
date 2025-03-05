package org.miccab.installation.flow.api;

import jakarta.inject.Singleton;
import org.slf4j.Logger;

@Singleton
public class Spike {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Spike.class);
    public Spike() {
        LOG.info("Spike is here");
    }
}
