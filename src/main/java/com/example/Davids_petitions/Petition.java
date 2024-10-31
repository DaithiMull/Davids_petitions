package com.example.Davids_petitions;

public class Petition {
    private final Long id;
    private String title;
    private String description;

    public Petition(long l, String climateChangePetition, String s) {
        this.id = l;
        this.title = climateChangePetition;
        this.description = s;
    }

    // ... other fields as needed

    // Add the getter method for id
    public Long getId() {
        return id;
    }
}
