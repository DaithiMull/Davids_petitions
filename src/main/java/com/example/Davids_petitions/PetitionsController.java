package com.example.Davids_petitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PetitionsController {

    @Autowired
    private PetitionService petitionService;

    @GetMapping("/")
    public String homePage() {
        return "homepage";
    }

    @GetMapping("/petitions")
    public String viewAllPetitions(Model model) {
        List<Petition> petitions = petitionService.getAllPetitions();
        model.addAttribute("petitions", petitions);
        return "petitions";
    }

    @GetMapping("/create-petition")
    public String createPetitionForm() {
        return "create-petition";
    }

    @PostMapping("/create-petition")
    public String createPetition(Petition petition) {
        petitionService.addPetition(petition);
        return "redirect:/petitions";
    }

    // ... other methods for searching, viewing individual petitions, and signing petitions
}