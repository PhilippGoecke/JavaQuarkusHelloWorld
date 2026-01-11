package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greeting(String name) {
        return "Hello " + name + "! (Quarkus " + io.quarkus.runtime.Quarkus.class.getPackage().getImplementationVersion() + ")";
    }
}
