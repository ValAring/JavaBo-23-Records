package org.example;

import java.util.List;

public record Animal(
        int ID,
        String name,
        Species species,
        int age,
        Owner sponsor
) {
    public static int countSpecies(List<Animal> animals, Species numberOf){
        int x = 0;
        for (Animal animal : animals)
            if (animal.species().name().equals("Löwe"))
                x++;
        return x;
    }
}
