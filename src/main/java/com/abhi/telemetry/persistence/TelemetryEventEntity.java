package com.abhi.telemetry.persistence;

import com.abhi.telemetry.model.Status;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "telemetry_events")
public class TelemetryEventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String satelliteId;
    private Instant timestamp;
    private double batteryPercent;
    private double temperatureCelsius;
    private double latitude;
    private double longitude;

    @Enumerated(EnumType.STRING)
    private Status status;

    protected TelemetryEventEntity() {}

    public TelemetryEventEntity(
            String satelliteId,
            Instant timestamp,
            double batteryPercent,
            double temperatureCelsius,
            double latitude,
            double longitude,
            Status status
    ) {
        this.satelliteId = satelliteId;
        this.timestamp = timestamp;
        this.batteryPercent = batteryPercent;
        this.temperatureCelsius = temperatureCelsius;
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
    }
}
