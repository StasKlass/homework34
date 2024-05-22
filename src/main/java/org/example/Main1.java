package org.example;

public class Main1 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal1 lion = new Animal1("Лев");
        Animal1 tiger = new Animal1("Тигр");
        Animal1 bear = new Animal1("Медведь");

        lion.play();
        tiger.eat();
        bear.sleep();

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(bear);
        zoo.addAnimal(null);

        zoo.checkAnimals();
    }
}
