package com.demo.todo.service.impl;

import com.demo.todo.domain.dto.EventDto;
import com.demo.todo.domain.entity.Event;
import com.demo.todo.exception.GeneralException;
import com.demo.todo.mapper.EventMapper;
import com.demo.todo.repository.EventRepository;
import com.demo.todo.service.EventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event get(UUID id) {
        return eventRepository.getReferenceById(id);
    }

    @Override
    public Event insert(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event update(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event insert(EventDto eventDto) {
        if (eventDto != null) {
            Event event = EventMapper.INSTANCE.mapToEvent(eventDto);
            return eventRepository.save(event);
        } else {
            throw new GeneralException("Object is null");
        }
    }

    @Override
    public Event update(EventDto eventDto) {
        if (eventDto != null) {
            Event event = EventMapper.INSTANCE.mapToEvent(eventDto);
            return eventRepository.save(event);
        } else {
            throw new GeneralException("Object is null");
        }
    }

    @Override
    public void delete(UUID id) {
        eventRepository.deleteById(id);
    }
}
