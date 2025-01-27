package kz.bitlab.g130criteriabuilder.service;

import kz.bitlab.g130criteriabuilder.entity.Notebook;
import kz.bitlab.g130criteriabuilder.repository.NotebookRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotebookService {

    private final NotebookRepository notebookRepository;

    public Page<Notebook> getAllNotebooks(int page, int size, String sortBy, String sortOrder) {
        Sort.Direction direction = sortOrder.equals("ASC") ? Sort.Direction.ASC : Sort.Direction.DESC;
        Sort sort = Sort.by(direction, sortBy);
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        return notebookRepository.findAll(pageRequest);
    }

    public List<Notebook> search(Notebook notebook) {
        return notebookRepository.search(notebook);
    }
}
