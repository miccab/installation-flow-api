package org.miccab.installation.flow.api.model;

import io.micronaut.core.annotation.NonNull;

public interface Identified {

    @NonNull
    String getId();
}