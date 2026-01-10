package com.abhi.telemetry.service;

import com.abhi.telemetry.model.TelemetryEvent;
import com.abhi.telemetry.persistence.TelemetryEventEntity;
import com.abhi.telemetry.persistence.TelemetryEventRepository;
import org.springframework.stereotype.Component;

@Component
public class TelemetryProcessor {

    private final TelemetryEventRepository repository;

    public TelemetryProcessor(TelemetryEventRepository repository) {
        this.repository = repository;
    }

    public void process(TelemetryEvent event) {
        TelemetryEventEntity entity =
                new TelemetryEventEntity(
                        event.satelliteId(),
                        event.timestamp(),
                        event.batteryPercent(),
                        event.temperatureCelsius(),
                        event.latitude(),
                        event.longitude(),
                        event.status()
                );

        repository.save(entity);

        System.out.println(
                "Persisted telemetry on thread: " + Thread.currentThread().getName()
        );
    }
}
