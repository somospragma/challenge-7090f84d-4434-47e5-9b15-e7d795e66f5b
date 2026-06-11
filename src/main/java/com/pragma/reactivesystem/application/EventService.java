package com.pragma.reactivesystem.application;

import com.pragma.reactivesystem.domain.Event;
import com.pragma.reactivesystem.infrastructure.EventRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Mono<Event> processEvent(Event event) {
        // Lógica de procesamiento de eventos
        return eventRepository.save(event);
    }
}