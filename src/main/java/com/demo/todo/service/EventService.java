package com.demo.todo.service;

import com.demo.todo.domain.dto.EventDto;
import com.demo.todo.domain.entity.Event;

public interface EventService extends CrudService<Event>{
    Event insert(EventDto eventDto);

    Event update(EventDto eventDto);
}
