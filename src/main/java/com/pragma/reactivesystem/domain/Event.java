package com.pragma.reactivesystem.domain;

public class Event {
    private String id;
    private long timestamp;
    private String eventType;
    private String payload;

    public Event(String id, long timestamp, String eventType, String payload) {
        this.id = id;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.payload = payload;
    }

    public String getId() {
        return id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public String getPayload() {
        return payload;
    }
}