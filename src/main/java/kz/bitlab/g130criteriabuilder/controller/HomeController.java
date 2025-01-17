package kz.bitlab.g130criteriabuilder.controller;

import kz.bitlab.g130criteriabuilder.entity.Brand;
import kz.bitlab.g130criteriabuilder.entity.Notebook;
import kz.bitlab.g130criteriabuilder.entity.Processor;
import kz.bitlab.g130criteriabuilder.service.BrandService;
import kz.bitlab.g130criteriabuilder.service.NotebookService;
import kz.bitlab.g130criteriabuilder.service.ProcessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final NotebookService notebookService;
    private final BrandService brandService;
    private final ProcessorService processorService;

    @GetMapping("/")
    public String home(Model model) {
        List<Notebook> notebooks = notebookService.getAllNotebooks();
        model.addAttribute("notebooks", notebooks);

        List<Brand> brands = brandService.getAllBrands();
        model.addAttribute("brands", brands);

        List<Processor> processors = processorService.getAllProcessors();
        model.addAttribute("processors", processors);
        return "home";
    }

    @GetMapping("/dynamic-search")
    public String dynamicSearch(Notebook notebook, Model model) {
        List<Notebook> notebooks = notebookService.search(notebook);
        model.addAttribute("notebooks", notebooks);

        List<Brand> brands = brandService.getAllBrands();
        model.addAttribute("brands", brands);

        List<Processor> processors = processorService.getAllProcessors();
        model.addAttribute("processors", processors);
        return "home";
    }
}
