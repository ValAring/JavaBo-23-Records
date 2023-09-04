package org.example;

public record Animal(
        int ID,
        String name,
        Species species,
        int age,
        Owner sponsor
) {

}
