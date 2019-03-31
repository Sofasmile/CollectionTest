package com.shop;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TradeShopTest {
    private List<Fruit> firstListOfFruits;
    private List<Fruit> secondListOfFruits;
    private TradeShop tradeShop;
    private static final String FIRST_FILE = "FirstFile.json";
    private static final String SECOND_FILE = "SecondFile.json";
    private static final String DB_FILE = "DbFile.json";

    @Before
    public void setUp() {
        tradeShop = new TradeShop();
        firstListOfFruits = new ArrayList<>();
        secondListOfFruits = new ArrayList<>();
        LocalDate firstDate = LocalDate.of(2019, 3, 25);
        LocalDate secondDate = LocalDate.of(2019, 3, 27);

        firstListOfFruits.add(new Fruit(TypeFruit.CHERRY, 5, firstDate, 85));
        firstListOfFruits.add(new Fruit(TypeFruit.BANANA, 7, firstDate, 40));
        firstListOfFruits.add(new Fruit(TypeFruit.PLUM, 8, firstDate, 90));
        firstListOfFruits.add(new Fruit(TypeFruit.BANANA, 3, firstDate, 40));
        firstListOfFruits.add(new Fruit(TypeFruit.LEMON, 10, firstDate, 30));
        FileUtil.writeToFile(firstListOfFruits, FIRST_FILE);

        secondListOfFruits.add(new Fruit(TypeFruit.APPLE, 15, secondDate, 25));
        secondListOfFruits.add(new Fruit(TypeFruit.PEACH, 9, secondDate, 20));
        secondListOfFruits.add(new Fruit(TypeFruit.CHERRY, 4, secondDate, 85));
        secondListOfFruits.add(new Fruit(TypeFruit.ORANGE, 5, secondDate, 55));
        secondListOfFruits.add(new Fruit(TypeFruit.PEAR, 7, secondDate, 60));
        FileUtil.writeToFile(secondListOfFruits, SECOND_FILE);
    }

    @Test
    public void testAddFruits() {
        tradeShop.addFruits(FIRST_FILE);
        List<Fruit> fruits = tradeShop.getFruits();
        assertEquals(firstListOfFruits.size(), fruits.size());
        for (int i = 0; i < fruits.size(); i++) {
            assertEquals(firstListOfFruits.get(i), fruits.get(i));
        }
    }

    @Test
    public void testLoad() {
        tradeShop.addFruits(FIRST_FILE);
        tradeShop.load(SECOND_FILE);
        List<Fruit> fruits = tradeShop.getFruits();
        assertEquals(secondListOfFruits.size(), fruits.size());
        for (int i = 0; i < fruits.size(); i++) {
            assertEquals(secondListOfFruits.get(i), fruits.get(i));
        }
    }

    @Test
    public void testGetSpoiledFruits() {
        tradeShop.addFruits(FIRST_FILE);
        LocalDate date = LocalDate.of(2019, 4, 1);
        List<Fruit> spoiledFruits = tradeShop.getSpoiledFruits(date);
        assertEquals(2, spoiledFruits.size());
        assertEquals(firstListOfFruits.get(2), spoiledFruits.get(0));
        assertEquals(firstListOfFruits.get(4), spoiledFruits.get(1));
    }

    @Test
    public void testGetAvailableFruits() {
        tradeShop.addFruits(FIRST_FILE);
        LocalDate date = LocalDate.of(2019, 4, 1);
        List<Fruit> availableFruits = tradeShop.getAvailableFruits(date);
        assertEquals(3, availableFruits.size());
        assertEquals(availableFruits.get(0), firstListOfFruits.get(0));
        assertEquals(availableFruits.get(1), firstListOfFruits.get(1));
        assertEquals(availableFruits.get(2), firstListOfFruits.get(3));
    }

    @Test
    public void testGetSpoiledFruitsByType() {
        tradeShop.addFruits(FIRST_FILE);
        LocalDate date = LocalDate.of(2019, 4, 1);
        List<Fruit> spoiledFruits = tradeShop.getSpoiledFruits(date, TypeFruit.LEMON);
        assertEquals(1, spoiledFruits.size());
        assertEquals(spoiledFruits.get(0), firstListOfFruits.get(4));
    }

    @Test
    public void teatGetAvailableFruitsByType() {
        tradeShop.addFruits(FIRST_FILE);
        LocalDate date = LocalDate.of(2019, 4, 1);
        List<Fruit> availableFruits = tradeShop.getAvailableFruits(date, TypeFruit.BANANA);
        assertEquals(2, availableFruits.size());
        assertEquals(availableFruits.get(0), firstListOfFruits.get(1));
        assertEquals(availableFruits.get(1), firstListOfFruits.get(3));
    }

    @Test
    public void testGetAddedFruits() {
        tradeShop.addFruits(FIRST_FILE);
        tradeShop.addFruits(SECOND_FILE);
        tradeShop.save(DB_FILE);
        LocalDate date = LocalDate.of(2019, 3, 27);
        List<Fruit> addedFruits = tradeShop.getAddedFruits(date);
        assertEquals(secondListOfFruits.size(), addedFruits.size());
        for (int i = 0; i < addedFruits.size(); i++) {
            assertEquals(secondListOfFruits.get(i), addedFruits.get(i));
        }
    }

    @Test
    public void testGetAddedFruitsByType() {
        tradeShop.addFruits(FIRST_FILE);
        tradeShop.addFruits(SECOND_FILE);
        tradeShop.save(DB_FILE);
        LocalDate date = LocalDate.of(2019, 3, 25);
        List<Fruit> addedFruits = tradeShop.getAddedFruits(date, TypeFruit.BANANA);
        assertEquals(2, addedFruits.size());
        assertEquals(addedFruits.get(0), firstListOfFruits.get(1));
        assertEquals(addedFruits.get(1), firstListOfFruits.get(3));
    }
}
