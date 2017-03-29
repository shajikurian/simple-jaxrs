package com.sk.tutorial.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
@ApplicationPath("rest")
public class JrsApplication extends ResourceConfig {
	public JrsApplication() {
		System.out.println("Package scanning....");
        packages("com.sk.tutorial.jersey");
    }
}
