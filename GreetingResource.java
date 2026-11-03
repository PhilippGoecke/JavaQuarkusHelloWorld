package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return service.greeting(name) + versionInfo("<br>");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World!" + versionInfo("\n");
    }

    private String versionInfo(String lineBreak) {
        return lineBreak + "Java version: " + System.getProperty("java.version")
            + lineBreak + "Quarkus version: " + io.quarkus.runtime.Version.getVersion();
    }
}
