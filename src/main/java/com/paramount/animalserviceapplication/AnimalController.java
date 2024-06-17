package com.paramount.animalserviceapplication;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Controller
public class AnimalController {

    private static final List<String> animals = new ArrayList<>();
    private static final List<String> mammals = new ArrayList<>();
    private static final List<String> reptiles = new ArrayList<>();

    static {
        fillAnimalList();
    }

    @GetMapping("/getRandomAnimal")
    @ResponseBody
    public ResponseEntity<String> getRandomAnimal(@RequestParam(required = false) String type) {
        List<String> sourceList = Optional.ofNullable(type)
                .map(this::selectSourceList)
                .orElse(animals);

        if (type != null && !type.equals("mammals") && !type.equals("reptiles")) {
            return ResponseEntity.notFound().build(); // Return 404 if type is not null and not "mammals" or "reptiles"
        }

        String randomAnimal = sourceList.get(new Random().nextInt(sourceList.size()));
        return ResponseEntity.ok(randomAnimal);
    }

    private List<String> selectSourceList(String type) {
        return switch (type) {
            case "mammals" -> mammals;
            case "reptiles" -> reptiles;
            case "" -> throw new IllegalArgumentException("Invalid animal type: " + type);
            default -> animals;
        };
    }

    private static void fillAnimalList() {
        try {
            InputStream inputStream = AnimalController.class.getResourceAsStream("/animals.txt");
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                String currentCategory = null;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        if (line.startsWith("#")) {
                            // It's a category line
                            if (line.contains("Mammals")) {
                                currentCategory = "Mammals";
                            } else if (line.contains("Reptiles")) {
                                currentCategory = "Reptiles";
                            }
                        } else {
                            // It's an animal line
                            if (currentCategory != null) {
                                // Ensure currentCategory is not null
                                switch (currentCategory) {
                                    case "Mammals":
                                        mammals.add(line.trim());
                                        break;
                                    case "Reptiles":
                                        reptiles.add(line.trim());
                                        break;
                                    default:
                                        // Other categories, you can handle them as needed
                                        break;
                                }
                            }
                        }
                    }
                }
                animals.addAll(mammals);
                animals.addAll(reptiles);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}