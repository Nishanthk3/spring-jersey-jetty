package com.example.demo.config;

import com.example.demo.resource.InitialResource;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {

        register(InitialResource.class);
        register(DemoListener.class);

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(EmployeeService.class).to(EmployeeServiceImpl.class);
            }
        });
    }
}