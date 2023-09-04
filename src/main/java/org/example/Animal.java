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

    public Animal withAge(int bDay){
        return new Animal(ID, name, species, bDay, sponsor);
    }
    public Animal withOwner(Owner newSponsor){
        return new Animal(ID, name, species, age, newSponsor);
    }
}
