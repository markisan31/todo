package com.demo.todo.controller;

import com.demo.todo.domain.dto.EventDto;
import com.demo.todo.domain.entity.Event;
import com.demo.todo.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("")
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

    @GetMapping("{id}")
    public Event getEventById(@PathVariable("id") UUID id) {
        return eventService.get(id);
    }

    @PostMapping
    public Event createEvent(@RequestBody EventDto event) {
        return eventService.insert(event);
    }
}
