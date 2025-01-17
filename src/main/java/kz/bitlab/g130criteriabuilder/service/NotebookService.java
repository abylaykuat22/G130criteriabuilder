package kz.bitlab.g130criteriabuilder.service;

import kz.bitlab.g130criteriabuilder.entity.Notebook;
import kz.bitlab.g130criteriabuilder.repository.NotebookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotebookService {

    private final NotebookRepository notebookRepository;

    public List<Notebook> getAllNotebooks() {
        return notebookRepository.findAll();
    }

    public List<Notebook> search(Notebook notebook) {
        return notebookRepository.search(notebook);
    }
}
