package com.todo.list.service.impl;

import com.todo.list.model.entity.ListEntity;
import com.todo.list.model.mapper.ListMapper;
import com.todo.list.model.request.ListRequest;
import com.todo.list.model.response.ListResponse;
import com.todo.list.repository.ListRepository;
import com.todo.list.service.ListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ListServiceImpl implements ListService {

    private final ListMapper listMapper;

    private final ListRepository listRepository;

    @Override
    public ListResponse create(ListRequest request) {
        ListEntity newList = listMapper.toEntity(request);
        ListEntity savedList = listRepository.save(newList);
        return listMapper.toDTO(savedList);
    }

    @Override
    public void update(ListRequest listRequest, Long id) {
        ListEntity foundList = listRepository.findById(id).orElseThrow();
        foundList.setTitle(listRequest.getTitle());
        listRepository.save(foundList);

    }

    @Override
    public void delete(Long id) {
        var foundList = listRepository.findById(id).orElseThrow();
        listRepository.delete(foundList);
    }

}
