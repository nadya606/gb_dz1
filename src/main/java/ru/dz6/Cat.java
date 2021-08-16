package ru.dz6;

public class Cat extends Animal{
    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance, 300, 0);
    }
    @Override
    public void swim(int swimDistance) {
        if (swimDistance >= 0) {
            System.out.println(name + " не умеет плавать");
        }
    }

}
