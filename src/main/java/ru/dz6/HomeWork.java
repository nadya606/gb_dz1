package ru.dz6;

public class HomeWork {
    public static void main(String[] args) {
        Animal Cat = new Cat("Барсик", 200, 50);
        Animal Dog = new Dog("Тузик",600,100);

        Cat.run(Cat.runDistance);
        Cat.swim(Cat.swimDistance);
        Dog.run(Dog.runDistance);
        Dog.swim(Dog.swimDistance);
    }

}
