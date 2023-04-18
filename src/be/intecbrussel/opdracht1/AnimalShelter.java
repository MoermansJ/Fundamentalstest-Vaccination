package be.intecbrussel.opdracht1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AnimalShelter {
    //properties
    private List<Animal> animals = new ArrayList<>();
    private int animalId;


    //constructors
    public AnimalShelter() {
        this(0);
    }

    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }


    //getters & setters
    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }


    //custom methods
    public void printAnimals() {
        animals.forEach(System.out::println);
    }

    public void sortAnimals() {
        animals.sort(Comparator.comparing(Animal::getAnimalNumber));
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAnimalsByAge() {
        animals.sort(Comparator.comparing(Animal::getAge));
    }

    public void printAnimalsNotVaccinated(Disease disease) {
        animals.stream().filter(animal -> !animal.getIsVaccinated().get(disease)).forEach(System.out::println);
    }

    public Optional<Animal> findAnimal(int animalNumber) {
        List<Animal> searchResult = animals.stream().filter(animal -> animal.getAnimalNumber() == animalNumber).toList();

        if (searchResult.size() <= 0) {
            return Optional.empty();
        }

        return Optional.of(searchResult.get(0)); //assuming animalNumber is always unique this will work
    }

    public Optional<Animal> findAnimal(String name) {
        List<Animal> searchResult = animals.stream().filter(animal -> animal.getName().equals(name.toLowerCase())).toList();

        if (searchResult.size() <= 0) {
            return Optional.empty();
        }

        return Optional.of(searchResult.get(0)); //assuming animalNumber is always unique this will work
    }

    public void treatAnimal(int animalNumber) {
        List<Animal> searchResult = animals.stream().filter(animal -> animal.getAnimalNumber() == animalNumber).toList();

        if (searchResult.size() <= 0) {
            System.out.println("animalNumber not found!");
            return;
        }

        searchResult.get(0).treatAnimal();
    }

    public void treatAnimal(String name) {
        List<Animal> searchResult = animals.stream().filter(animal -> animal.getName().equals(name.toLowerCase())).toList();

        if (searchResult.size() <= 0) {
            System.out.println("name not found!");
            return;
        }

        searchResult.get(0).treatAnimal();
    }

    public void treatAllAnimals() {
        for (Animal animal : animals) {
            animal.treatAnimal();
        }
    }

    public Animal findOldestAnimal() {
        sortAnimalsByAge();
        return animals.get(animals.size() - 1);
    }

    public int countAnimals() {
        return animals.size();
    }

    public void addAnimal(Animal animal) {
        animal.setAnimalNumber(animalId);
        animal.setName(animal.getName().toLowerCase());
        animals.add(animal);
        animalId++;
    }
}
