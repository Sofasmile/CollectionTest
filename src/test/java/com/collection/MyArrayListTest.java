package com.collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private List<String> arrayList;

    @Before
    public void setUp() {
        arrayList = new MyArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
    }

    @Test
    public void testAddElement() {
        arrayList.add("Fourth");
        assertEquals("First", arrayList.get(0));
        assertEquals("Second", arrayList.get(1));
        assertEquals("Third", arrayList.get(2));
        assertEquals("Fourth", arrayList.get(3));
    }

    @Test
    public void testRemoveElement() {
        arrayList.remove(0);
        assertEquals("Second", arrayList.get(0));
        assertEquals("Third", arrayList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveElementException() {
        arrayList.remove(20);
    }

    @Test
    public void testGetElement() {
        assertEquals("Second", arrayList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElementException() {
        arrayList.get(12);
    }

    @Test
    public void testClearList() {
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }

    @Test
    public void testSizeArray() {
        assertEquals(3, arrayList.size());
    }
}
