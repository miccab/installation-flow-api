package org.miccab.installtion.flow.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/installations")
public class InstallationController {
    @Get
    public List<String> list() {
        return List.of("Hello World");
    }
}
