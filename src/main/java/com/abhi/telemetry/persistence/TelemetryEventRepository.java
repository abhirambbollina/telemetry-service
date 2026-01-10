package com.abhi.telemetry.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetryEventRepository
        extends JpaRepository<TelemetryEventEntity, Long> {
}
