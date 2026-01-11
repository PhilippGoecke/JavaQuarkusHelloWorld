package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.runtime.Version;

@ApplicationScoped
public class GreetingService {
    public String greeting(String name) {
        return "Hello " + name + "!<br>(Quarkus " + Version.getVersion() + ")";
    }
    }

}
