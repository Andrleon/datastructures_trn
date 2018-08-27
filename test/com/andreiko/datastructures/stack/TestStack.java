package com.andreiko.datastructures.stack;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class TestStack {
    @Test
    public void testPushAndPop() {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");

        assertEquals(arrayStack.size(), 3);

        assertEquals(arrayStack.pop(), "C");
        assertEquals(arrayStack.pop(), "B");
        assertEquals(arrayStack.pop(), "A");

        assertEquals(arrayStack.size(), 0);
    }

    @Test
    public void testPushAndPeek() {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");

        assertEquals(arrayStack.size(), 3);

        assertEquals(arrayStack.peek(), "C");
        assertEquals(arrayStack.peek(), "C");

        assertEquals(arrayStack.size(), 3);
    }

    @Test(expected = NoSuchElementException.class)
    public void testPopFromEmptyStack() {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.pop();
    }

}