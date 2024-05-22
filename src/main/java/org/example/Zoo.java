package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final Logger logger = LoggerFactory.getLogger(Zoo.class);
    private List<Animal1> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal1 animal) {
        if (animal == null || animal.getName() == null) {
            logger.error("Некорректные данные для животного.");
        } else {
            animals.add(animal);
            logger.info("Добавлено животное: {}", animal.getName());
        }
    }

    public void checkAnimals() {
        if (animals.isEmpty()) {
            logger.warn("В зоопарке нет животных для проверки.");
            return;
        }

        for (Animal1 animal : animals) {
            if (animal == null) {
                logger.error("Обнаружено животное с отсутствующими данными.");
                continue;
            }

            String name = animal.getName();
            int energy = animal.getEnergy();

            if (name == null || name.isEmpty()) {
                logger.error("У животного отсутствует имя.");
            } else if (energy < 0) {
                logger.error("У животного {} некорректный уровень энергии: {}", name, energy);
            } else {
                logger.info("Животное: {} - Энергия: {}", name, energy);
            }
        }
    }
}
