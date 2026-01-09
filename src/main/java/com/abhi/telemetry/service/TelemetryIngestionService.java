package com.abhi.telemetry.service;

import com.abhi.telemetry.model.TelemetryEvent;
import org.springframework.stereotype.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Service
public class TelemetryIngestionService {

    private final TelemetryProcessor processor;
    private final ExecutorService executor = Executors.newFixedThreadPool(4);


    public TelemetryIngestionService(TelemetryProcessor processor) {
        this.processor = processor;
    }

    public void ingest(TelemetryEvent event) {
        executor.submit(() -> processor.process(event));
    }
}
