package com.todo.list.model.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
public class ListRequest {

    @NotEmpty(message = "Title is mandatory")
    private String title;
}
