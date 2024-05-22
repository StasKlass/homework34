package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal1 {
    private static final Logger logger = LoggerFactory.getLogger(Animal.class);
    private String name;
    private int energy;

    public Animal1(String name) {
        this.name = name;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void eat() {
        energy += 20;
        logger.info("Животное {} поело и его энергия теперь {}.", name, energy);
    }

    public void sleep() {
        energy += 30;
        logger.info("Животное {} поспало и его энергия теперь {}.", name, energy);
    }

    public void play() {
        energy -= 40;
        logger.info("Животное {} поиграло и его энергия теперь {}.", name, energy);
        if (energy < 0) {
            logger.warn("Животное {} устало и нуждается в отдыхе.", name);
        }
    }
}
