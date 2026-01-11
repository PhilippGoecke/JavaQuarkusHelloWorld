package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Hello " + name + "!<br>(Quarkus " + io.quarkus.builder.Version.getVersion() + ")";
    }

}
