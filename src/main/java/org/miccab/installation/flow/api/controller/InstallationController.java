package org.miccab.installation.flow.api.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Map;

@Controller("/installations")
public class InstallationController {
    @Get
    public Map<String, Object> list() {
        return Map.of("one", "Hello World");
    }
}
