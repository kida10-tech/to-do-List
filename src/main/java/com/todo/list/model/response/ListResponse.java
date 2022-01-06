package com.todo.list.model.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListResponse {

    private Long id;
    private String title;
    private Boolean done;
}
