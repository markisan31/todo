package com.demo.todo.mapper;

import com.demo.todo.domain.dto.EventDto;
import com.demo.todo.domain.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(config = IgnoreUnmappedMapperConfig.class)
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    Event mapToEvent(EventDto event);
}
