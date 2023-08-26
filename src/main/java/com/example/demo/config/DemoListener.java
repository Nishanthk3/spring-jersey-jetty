package com.example.demo.config;

import org.glassfish.jersey.server.monitoring.ApplicationEvent;
import org.glassfish.jersey.server.monitoring.ApplicationEventListener;
import org.glassfish.jersey.server.monitoring.RequestEvent;
import org.glassfish.jersey.server.monitoring.RequestEventListener;

public class DemoListener implements ApplicationEventListener {

    @Override
    public void onEvent(ApplicationEvent type) {
        switch (type.getType()) {
            case INITIALIZATION_START:
                System.out.println("INITIALIZATION_START Event Type Triggered");
            case INITIALIZATION_APP_FINISHED:
                System.out.println("INITIALIZATION_APP_FINISHED Event Type Triggered");
            case INITIALIZATION_FINISHED:
                System.out.println("INITIALIZATION_FINISHED Event Type Triggered");
            case DESTROY_FINISHED:
                System.out.println("DESTROY_FINISHED Event Type Triggered");
            case RELOAD_FINISHED:
                System.out.println("RELOAD_FINISHED Event Type Triggered");
        }
    }

    @Override
    public RequestEventListener onRequest(RequestEvent requestEvent) {
        return null;
    }
}
