package com.abhi.telemetry.service;

import com.abhi.telemetry.model.TelemetryEvent;
import org.springframework.stereotype.Component;

@Component
public class TelemetryProcessor {

    public void process(TelemetryEvent event) {
        System.out.println("Processing telemetry: " + event);
    }
}
