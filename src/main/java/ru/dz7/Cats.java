package ru.dz7;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety; //2.	Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.

    Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    //3.	Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite) && !satiety) {
            System.out.println(name + " ест ");
            plate.decreaseFood(appetite);
            satiety = true;
        }
        else if (satiety) {
            System.out.println(name + " сыт и доволен");
        }
    }



}
