package org.miccab.installation.flow.api.repository;

import io.micronaut.core.annotation.NonNull;

@FunctionalInterface
public interface IdGenerator {

    @NonNull
    String generate();
}