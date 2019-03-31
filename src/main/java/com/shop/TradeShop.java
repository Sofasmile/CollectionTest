package com.shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TradeShop {
    private List<Fruit> fruits = new ArrayList<>();

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void addFruits(String pathToJsonFile) {
        fruits.addAll(FileUtil.readFromFile(pathToJsonFile));
    }

    public void save(String pathToJsonFile) {
        FileUtil.writeToFile(fruits, pathToJsonFile);
    }

    public void load(String pathToJsonFile) {
        fruits.clear();
        addFruits(pathToJsonFile);
    }

    private boolean isSpoiled(Fruit fruit, LocalDate date) {
        return fruit.getDate().plusDays(fruit.getShelfLife()).isAfter(date);
    }

    public List<Fruit> getSpoiledFruits(LocalDate date) {
        List<Fruit> listOfSpoiledFruits = fruits.stream()
                .filter(fruit -> isSpoiled(fruit, date))
                .collect(Collectors.toList());
        return listOfSpoiledFruits;
    }

    public List<Fruit> getAvailableFruits(LocalDate date) {
        List<Fruit> listOfAvailableFruits = fruits.stream()
                .filter(fruit -> !isSpoiled(fruit, date))
                .collect(Collectors.toList());
        return listOfAvailableFruits;
    }

    public List<Fruit> getSpoiledFruits(LocalDate date, TypeFruit type) {
        List<Fruit> listOfSpoiledFruits = fruits.stream()
                .filter(fruit -> fruit.getTypeFruit().equals(type))
                .filter(fruit -> isSpoiled(fruit, date))
                .collect(Collectors.toList());
        return listOfSpoiledFruits;
    }

    public List<Fruit> getAvailableFruits(LocalDate date, TypeFruit type) {
        List<Fruit> listOfAvailableFruits = fruits.stream()
                .filter(fruit -> fruit.getTypeFruit().equals(type))
                .filter(fruit -> !isSpoiled(fruit, date))
                .collect(Collectors.toList());
        return listOfAvailableFruits;
    }

    public List<Fruit> getAddedFruits(LocalDate date) {
        List<Fruit> listOfAvailableFruits = fruits.stream()
                .filter(fruit -> fruit.getDate().equals(date))
                .collect(Collectors.toList());
        return listOfAvailableFruits;
    }

    public List<Fruit> getAddedFruits(LocalDate date, TypeFruit type) {
        List<Fruit> listOfAvailableFruits = fruits.stream()
                .filter(fruit -> fruit.getTypeFruit().equals(type) && fruit.getDate().equals(date))
                .collect(Collectors.toList());
        return listOfAvailableFruits;
    }

    public void show(List<Fruit> fruitList) {
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.getTypeFruit() + " \t"
                    + fruit.getDate() + " \t"
                    + fruit.getShelfLife()
                    + " \t" + fruit.getPrice());
        }
    }
}
