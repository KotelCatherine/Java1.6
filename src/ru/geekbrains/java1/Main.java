package ru.geekbrains.java1;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();
        Animal catCount = new Cat();
        Animal dogCount = new Dog();

        cat1.swimAnimal(4);
        cat2.runAnimal(200);
        dog1.runAnimal(500);
        dog2.runAnimal(10);
        dog3.swimAnimal(50);


        int animals = (((Cat) catCount).getCount() - 1) + (((Dog) dogCount).getCount() - 1);

        System.out.println("Cat: " + (((Cat) catCount).getCount() - 1) + "\nDog: " + (((Dog) dogCount).getCount() - 1) + "\nAnimals: " + animals);
    }
}
