package com.collection;

import com.exception.NodeIndexOutBoundaryException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    private MyLinkedList<Double> linkedList;

    @Before
    public void setUp() {
        linkedList = new MyLinkedList<>();
        linkedList.add(10.5);
        linkedList.add(2.3);
        linkedList.add(3.9);
    }

    @Test
    public void testAddElement() {
        linkedList.add(20.4);
        assertEquals(10.5, linkedList.get(0), 0.0);
        assertEquals(2.3, linkedList.get(1), 0.0);
        assertEquals(3.9, linkedList.get(2), 0.0);
        assertEquals(20.4, linkedList.get(3), 0.0);
    }

    @Test
    public void testRemoveElement() {
        linkedList.remove(1);
        assertEquals(10.5, linkedList.get(0), 0.0);
        assertEquals(3.9, linkedList.get(1), 0.0);
    }

    @Test(expected = NodeIndexOutBoundaryException.class)
    public void testRemoveElementException() {
        linkedList.remove(20);
    }

    @Test
    public void testGetElement() {
        assertEquals(3.9, linkedList.get(2), 0.0);
    }

    @Test(expected = NodeIndexOutBoundaryException.class)
    public void testGetElementException() {
        linkedList.get(5);
    }

    @Test
    public void testClearList() {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test
    public void testSizeList() {
        assertEquals(3, linkedList.size());
    }
}
