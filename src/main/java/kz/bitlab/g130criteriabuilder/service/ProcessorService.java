package kz.bitlab.g130criteriabuilder.service;

import kz.bitlab.g130criteriabuilder.entity.Processor;
import kz.bitlab.g130criteriabuilder.repository.ProcessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcessorService {

    private final ProcessorRepository processorRepository;

    public List<Processor> getAllProcessors() {
        return processorRepository.findAll();
    }
}
