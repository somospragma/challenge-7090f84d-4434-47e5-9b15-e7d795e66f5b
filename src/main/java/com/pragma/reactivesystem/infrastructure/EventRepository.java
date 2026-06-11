package com.pragma.reactivesystem.infrastructure;

import com.pragma.reactivesystem.domain.Event;
import reactor.core.publisher.Mono;

public interface EventRepository {
    Mono<Event> save(Event event);
    Mono<Event> findById(String id);
}