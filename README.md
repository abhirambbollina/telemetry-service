# Telemetry Ingestion Service

A Spring Boot–based backend service that ingests satellite telemetry events over HTTP as JSON, processes them asynchronously, and serves as a foundation for durable storage and analytics.

## Architecture
- REST API for telemetry ingestion
- Controller → Service → Processor separation
- JSON deserialization via Jackson
- Designed for asynchronous processing and persistence

## Running Locally
```bash
mvn spring-boot:run
