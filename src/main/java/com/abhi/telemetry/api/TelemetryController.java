package com.abhi.telemetry.api;

import com.abhi.telemetry.model.TelemetryEvent;
import com.abhi.telemetry.service.TelemetryIngestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telemetry")
public class TelemetryController {

    private final TelemetryIngestionService ingestionService;

    public TelemetryController(TelemetryIngestionService ingestionService) {
        this.ingestionService = ingestionService;
    }

    @PostMapping
    public void ingest(@RequestBody TelemetryEvent event) {
        ingestionService.ingest(event);
    }
}
