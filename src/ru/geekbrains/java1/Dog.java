package ru.geekbrains.java1;

public class Dog extends Animal{
    public static int count;
    Dog() {
        count++;
    }

    @Override
    public void runAnimal(int run) {
        this.run = run;
        if(run > 500) {
            run = 500;
        }
        System.out.println("The dog ran " + run + " m.");
    }

    @Override
    public void swimAnimal(int swim) {
        this.swim = swim;
        if (swim > 10) {
            swim = 10;
        }
        System.out.println("The dog swam " + swim + " m.");
    }


    public int getCount() {
        return count;
    }
}

