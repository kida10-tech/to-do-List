package com.todo.list.model.mapper;

import com.todo.list.model.entity.ListEntity;
import com.todo.list.model.request.ListRequest;
import com.todo.list.model.response.ListResponse;
import org.springframework.stereotype.Component;

@Component
public class ListMapper {

    public ListEntity toEntity(ListRequest dto) {
        return ListEntity.builder()
                .title(dto.getTitle())
                .build();
    }

    public ListResponse toDTO(ListEntity entity) {
        return ListResponse.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .build();
    }

}
