package org.miccab.installtion.flow.api.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

import java.util.Map;

@Controller("/installations")
@Singleton
public class InstallationController {
    @Get
    public Map<String, Object> list() {
        return Map.of("one", "Hello World");
    }
}
