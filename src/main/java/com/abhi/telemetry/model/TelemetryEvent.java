package com.abhi.telemetry.model;

import java.time.Instant;

/**
 * Immutable telemetry event emitted by a satellite at a point in time.
 */
public record TelemetryEvent(
        String satelliteId,
        Instant timestamp,
        double batteryPercent,
        double temperatureCelsius,
        double latitude,
        double longitude,
        Status status
) {
}

