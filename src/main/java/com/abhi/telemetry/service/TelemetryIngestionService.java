package com.abhi.telemetry.service;

import com.abhi.telemetry.model.TelemetryEvent;
import org.springframework.stereotype.Service;

@Service
public class TelemetryIngestionService {

    private final TelemetryProcessor processor;

    public TelemetryIngestionService(TelemetryProcessor processor) {
        this.processor = processor;
    }

    public void ingest(TelemetryEvent event) {
        processor.process(event);
    }
}
