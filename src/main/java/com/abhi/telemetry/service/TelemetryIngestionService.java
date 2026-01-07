package com.abhi.telemetry.service;

import com.abhi.telemetry.model.TelemetryEvent;
import org.springframework.stereotype.Service;

@Service
public class TelemetryIngestionService {

    public void ingest(TelemetryEvent event) {
        System.out.println("Ingested telemetry event: " + event);
    }
}
