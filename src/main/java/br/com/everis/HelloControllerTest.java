package br.com.everis;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
class HelloEndPoint {

    @Get("/{name}")
    public String hello(String name) {
        return "Ola, " + name + "!";
    }

}
