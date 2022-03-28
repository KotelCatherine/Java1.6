package ru.geekbrains.java1;

public class Cat extends Animal{
    public static int count;

    Cat() {
        count++;
    }

    @Override
    public void runAnimal(int run) {
        this.run = run;
        if (run > 200) {
            run = 200;
        }
        System.out.println("The cat " + name + " ran " + run + " m.");
    }

    @Override
    public void swimAnimal(int swim) {
        System.out.println("Cats can't swim.");
    }

    public int getCount() {
        return count;
    }
}

