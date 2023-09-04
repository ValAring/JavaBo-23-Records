package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zoo!");

        Owner owner1 = new Owner("Pendelton Ward", 41, "Murika");
        Owner owner2 = new Owner("CNetwork", 29, "Murika");

        Species lion = new Species("Löwe", "Fleisch 7000");
        Species ape = new Species("Affe", "Pflanzen 3000");
        Species wolf = new Species("Wolf", "Fleisch 3000");
        Species horse = new Species("Pferd", "Heu 10000");

        Animal monkey = new Animal(1, "Finn", ape, 2, owner1);
        Animal lion1 = new Animal(2, "Bonnabel", lion, 8, owner1);
        Animal lion2 = new Animal(3, "Marceline", lion, 7, owner2);
        Animal wolf2 = new Animal(4, "Jake", wolf, 6, owner1);
        Animal fert = new Animal(5, "Lady Rainicorn", horse, 8, owner2);

        System.out.println("Ist Finn ein Affe? "+monkey.species().name().equals("Affe"));
        System.out.println(fert.toString());

    }
}