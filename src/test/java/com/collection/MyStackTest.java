package com.collection;

import com.exception.NodeIndexOutBoundaryException;
import com.exception.StackEmptyException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {
    private MyStack<String> stack;

    @Before
    public void setUp() {
        stack = new MyStack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
    }

    @Test
    public void testPushElement() {
        stack.push("Fourth");
        assertEquals("Fourth", stack.peek());
    }

    @Test
    public void testPeekElement() {
        assertEquals("Third", stack.peek());
    }

    @Test
    public void testSizeStack() {
        assertEquals(3, stack.size());
    }

    @Test
    public void testClearStack() {
        stack.clear();
        assertEquals(0, stack.size());
    }

    @Test
    public void testRemoveElement() {
        stack.remove(2);
        assertEquals(2, stack.size());
    }

    @Test(expected = NodeIndexOutBoundaryException.class)
    public void testRemoveElementException() {
        stack.remove(20);
    }

    @Test
    public void testPopElemet() {
        assertEquals("Third", stack.pop());
    }

    @Test(expected = StackEmptyException.class)
    public void testPopElementException() {
        stack.remove(2);
        stack.remove(1);
        stack.remove(0);
        stack.pop();
    }
}
