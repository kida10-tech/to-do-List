package com.todo.list.controller;

import com.todo.list.model.request.ListRequest;
import com.todo.list.model.response.ListResponse;
import com.todo.list.service.ListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lists")
public class ListController {

    private final ListService listService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ListResponse create(@Valid @RequestBody ListRequest request) {
        return listService.create(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long id, @Valid @RequestBody ListRequest request) {
        listService.update(request, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        listService.delete(id);
    }

}
