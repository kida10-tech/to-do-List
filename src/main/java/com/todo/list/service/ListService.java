package com.todo.list.service;

import com.todo.list.model.request.ListRequest;
import com.todo.list.model.response.ListResponse;

public interface ListService {

    ListResponse create(ListRequest request);

    void update(ListRequest listRequest, Long id);

    void delete(Long id);

}
