package be.intecbrussel.opdracht1;

import java.util.Optional;

public class MainApp {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        Monkey jonathan = new Monkey(true, true, 28, "Jonathan", 28);
        Monkey joey = new Monkey(true, false, 29, "Joey", 29);
        Monkey quinten = new Monkey(false, true, 27, "Quinten", 27);
        Monkey manuel = new Monkey(false, false, 26, "Manuel", 26);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        animalShelter.addAnimal(jonathan);
        animalShelter.addAnimal(joey);
        animalShelter.addAnimal(quinten);
        animalShelter.addAnimal(manuel);
        animalShelter.addAnimal(cat1);
        animalShelter.addAnimal(cat2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(dog1);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog3);


//        animalShelter.sortAnimals(); //sorts by animalNumber ASC
//        animalShelter.sortAnimalsByAge(); //sorts by age ASC
//        animalShelter.sortAnimalsByName(); //sorts by name ASC

//        jonathan.vaccinateAnimal(Disease.POLIO); //vaccinates specific animal
//        animalShelter.printAnimalsNotVaccinated(Disease.POLIO);

//        animalShelter.printAnimals();
//        System.out.println(animalShelter.getAnimals().size()); //original size remains unchanged throughout all operations

//        System.out.println(animalShelter.findAnimal("JONATHAN"));//returns Optional<Animal>
//        System.out.println(animalShelter.findAnimal("NOTATHAN"));//returns empty Optional

        animalShelter.treatAnimal(0);

        Optional<Animal> animalToBeVaccedOptional = animalShelter.findAnimal("JoNatHaN");
        if (animalToBeVaccedOptional.isPresent()) {
            for (Disease disease : Disease.values()) {
                animalToBeVaccedOptional.get().vaccinateAnimal(disease);
            }
        }

        animalShelter.treatAllAnimals();

        animalShelter.printAnimals();
    }
}
