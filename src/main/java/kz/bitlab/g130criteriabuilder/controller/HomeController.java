package kz.bitlab.g130criteriabuilder.controller;

import kz.bitlab.g130criteriabuilder.entity.Notebook;
import kz.bitlab.g130criteriabuilder.service.NotebookService;
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

    @GetMapping("/")
    public String home(Model model) {
        List<Notebook> notebooks = notebookService.getAllNotebooks();
        model.addAttribute("notebooks", notebooks);
        return "home";
    }

    @GetMapping("/dynamic-search")
    public String dynamicSearch(Notebook notebook, Model model) {
        List<Notebook> notebooks = notebookService.search(notebook);
        model.addAttribute("notebooks", notebooks);
        return "home";
    }
}
