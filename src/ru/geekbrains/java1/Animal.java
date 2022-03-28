package ru.geekbrains.java1;

public abstract class Animal {
    protected String name;
    protected int run;
    protected int swim;


    abstract void runAnimal(int run);
    abstract void swimAnimal(int swim);

}