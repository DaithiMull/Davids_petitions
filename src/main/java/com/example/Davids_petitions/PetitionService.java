package com.example.Davids_petitions;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetitionService {
    private List<Petition> petitions = new ArrayList<>();

    public List<Petition> getAllPetitions() {
        List<Petition> petitions = new ArrayList<>();
        petitions.add(new Petition(1L, "Climate Change Petition", "Let's fight climate change together"));
        petitions.add(new Petition(2L, "Animal Rights Petition", "Protect our furry friends"));
        // ... add more petitions
        return petitions;
    }

    public void addPetition(Petition petition) {
    }

    public List<Petition> getPetitions() {
        return petitions;
    }

    public void setPetitions(List<Petition> petitions) {
        this.petitions = petitions;
    }

    // ... other methods for adding petitions
}
