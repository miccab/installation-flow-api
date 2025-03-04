package org.miccab.installtion.flow.api.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

@Controller("/installations")
@Singleton
public class InstallationController {
    @Get
    public String list() {
        return "Hello World";
    }
}
