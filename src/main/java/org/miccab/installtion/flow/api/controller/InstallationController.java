package org.miccab.installtion.flow.api.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/installations")
public class InstallationController {
    @Get
    public String list() {
        return "Hello World";
    }
}
