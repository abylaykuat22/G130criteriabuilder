package kz.bitlab.g130criteriabuilder.service;

import kz.bitlab.g130criteriabuilder.entity.Brand;
import kz.bitlab.g130criteriabuilder.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }
}
