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
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        String name = jakarta.ws.rs.core.Context.class.isAssignableFrom(jakarta.ws.rs.core.UriInfo.class)
            ? null
            : null; // fallback if context injection is not available

        // Try to get the "name" query parameter from the request
        jakarta.ws.rs.core.UriInfo uriInfo = jakarta.ws.rs.core.Context.class.isAssignableFrom(jakarta.ws.rs.core.UriInfo.class)
            ? null
            : null; // fallback if context injection is not available

        return "Hello " + (name != null && !name.isEmpty() ? name : "World") + "!";
    }
}
