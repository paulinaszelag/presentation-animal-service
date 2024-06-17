package com.paramount.animalserviceapplication;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnimalResponse {

    private String animal;

    public AnimalResponse(String animal) {
        this.animal = animal;
    }

}

