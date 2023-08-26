package com.example.demo.resource;

import com.example.demo.service.EmployeeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/")
public class InitialResource {

    private static final String APP_NAME = "Welcome to Spring Jersey Jetty Application";

    @Autowired
    private EmployeeService employeeServiceAutowire;

    @Inject
    private EmployeeService employeeServiceInject;

    @GET
    public String init() {
        return APP_NAME;
    }

    @GET
    @Path("/employee")
    public String employee() {
        String str = APP_NAME + " thru Employee Service";
        employeeServiceInject.getName(str + ": Inject Annotation JRS implementation");
        employeeServiceAutowire.getName(str + ": Autowire Annotation Spring framework implementation");
        return str;
    }
}
