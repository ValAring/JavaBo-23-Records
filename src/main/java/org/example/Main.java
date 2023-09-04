package org.example;

import java.util.ArrayList;
import java.util.List;

/* ## Aufgabe: Java-Record Zoo Projekt

Erstellt ein neues Projekt in IntelliJ und legt damit den Grundstein für das Java-Record Zoo Projekt.

* Lege eine Java-Record-Klasse "Animal" an, die für ID, Name, Art und Alter folgende Eigenschaften haben soll. Wähle geeignete Feldnamen.
* Macht einen Commit. Bitte poste hier den Link zu eurem GitHub-Repos, in dem ihr diese Aufgabe gemeinsam gelöst habt.

## Record-Methoden aufrufen
Nun prüfen wir die automatisch generierten Methoden.
* In einer main-Methode, erstellt mehrere Animals.
* Ruft die automatisch im Record generierten Methoden auf, und prüft, ob sie das tun, was ihr erwartet (equals, toString).

## Verschachtelung
Nun verwenden wir einen Record als Attribut eines anderen Records.
* Legt nun einen `Owner`-Record an, der einige Eigenschaften eines Tierbesitzers speichert (Name, Alter, Adresse).
* Lasst jedes `Animal` einen `Owner` haben.

## Verschachtelung + Wiederverwenden
Einen Record in mehreren anderen Records verwenden.
* Erstellt einen `Species`-Record, der die Eigenschaften einer Tierart speichert (Name, Futterbedarf in Gramm pro Tag).
* Lasst jedes `Animal` eine `Species` haben.
* In Eurer main-Methode, lasst mehrere `Animal`-Objekte die gleiche `Species` haben.
* Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite bearbeiten.

## Bonus-Aufgabe With-Methoden
Wenn ihr die Hauptaufgabe bereits gemeistert habt, könnt ihr euch an dieser Bonusaufgabe versuchen.
* Schreibe with-Methoden ('wither', so wie bei den Rechereche-Fragen) für alle Eigenschaften des `Animal`-Records.

## Bonus-Aufgabe Zoo
Wenn ihr die Hauptaufgabe bereits gemeistert habt, könnt ihr euch an dieser Bonusaufgabe versuchen.
* Implementiere einen "Zoo"-Record, der eine Liste aller Animals hat und den Gesamtfutterbedarf aller Tiere im Zoo berechnen kann.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Zoo!");

        Owner owner1 = new Owner("Pendelton Ward", 41, "Murika");
        Owner owner2 = new Owner("CNetwork", 29, "Murika");

        Species lion = new Species("Löwe", 7);
        Species ape = new Species("Affe", 3);
        Species wolf = new Species("Wolf", 3);
        Species horse = new Species("Pferd", 10);

        Animal monkey = new Animal(1, "Finn", ape, 2, owner1);
        Animal lion1 = new Animal(2, "Bonnabel", lion, 8, owner1);
        Animal lion2 = new Animal(3, "Marceline", lion, 7, owner2);
        Animal wolf2 = new Animal(4, "Jake", wolf, 6, owner1);
        Animal fert = new Animal(5, "Lady Rainicorn", horse, 8, owner2);

        System.out.println("Ist Finn ein Affe? "+monkey.species().name().equals("Affe"));
        System.out.println(fert.toString());

        List<Animal> animals = new ArrayList<>();
        animals.add(monkey);
        animals.add(lion1);
        animals.add(lion2);
        animals.add(wolf2);
        animals.add(fert);

        int lionsFound = Animal.countSpecies(animals, lion);
        System.out.println("How many lions are there? "+lionsFound);

        Animal monkeyAged = monkey.withAge(3);
        System.out.println("Monkey aged and is now: " + monkeyAged.age());
        Animal wolfNewOwner = wolf2.withOwner(owner2);
        System.out.println("Wolf now belongs to: " + wolfNewOwner.sponsor());

        int tonsOfFood = 0;
        for (Animal ani: animals) {
            tonsOfFood += ani.species().gramsPerDay();
        }
        System.out.println("Food consumed per day: "+tonsOfFood);
    }
}