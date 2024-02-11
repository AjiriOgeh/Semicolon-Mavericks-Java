import Stack.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    private MyStack myStack;


    @BeforeEach
    public void setUp(){
        myStack = new MyStack(5);
    }

    @Test
    public void newStackIsEmptyTest() {
        assertTrue(myStack.getIsEmpty());
    }

    @Test
    public void addElementToStack_StackNotEmptyTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        assertFalse(myStack.getIsEmpty());
    }

    @Test
    public void addElementToStack_RemoveElement_StackIsEmptyTest(){
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        assertFalse(myStack.getIsEmpty());

        myStack.pop();
        assertTrue(myStack.getIsEmpty());
    }

    @Test
    public void addTwoElementsToStack_RemoveElementTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");
        assertFalse(myStack.getIsEmpty());

        assertEquals("Jane Doe", myStack.pop());
    }

    @Test
    public void addThreeElementsToStack_CheckForTheLastElementTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");
        myStack.push("Jack Smith");
        assertFalse(myStack.getIsEmpty());

        assertEquals("Jack Smith", myStack.peek());
    }

    @Test
    public void addTwoElementsToStack_GetSizeTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");

        assertEquals(2, myStack.size());
    }

    @Test
    public void addThreeElementsToStack_RemoveOneElement_GetSizeTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");
        myStack.push("Jack Smith");
        assertFalse(myStack.getIsEmpty());

        assertEquals("Jack Smith", myStack.pop());

        assertEquals(2, myStack.size());

    }
    @Test
    public void addThreeElementsToStack_RemoveTwoElements_GetSizeTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");
        myStack.push("Jack Smith");
        assertFalse(myStack.getIsEmpty());

        assertEquals("Jack Smith", myStack.pop());
        assertEquals("Jane Doe", myStack.pop());

        assertEquals(1, myStack.size());

    }

    @Test
    public void removeElementFromEmptyStackTest() {
        assertTrue(myStack.getIsEmpty());

        assertEquals(0, myStack.size());

        assertThrows(EmptyStackException.class, ()-> myStack.pop());
    }

    @Test
    public void addElementToAFullStackTest() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");
        myStack.push("Jack Smith");
        myStack.push("Jill Smith");
        myStack.push("Jim Brown");

        assertEquals(5, myStack.size());

        assertThrows(StackOverflowError.class, ()-> myStack.push("Jessica Brown"));

    }

    @Test
    public void peekElementInEmptyStack() {
        assertTrue(myStack.getIsEmpty());

        assertThrows(EmptyStackException.class, ()-> myStack.peek());
    }

    @Test
    public void displayStack() {
        assertTrue(myStack.getIsEmpty());

        myStack.push("John Doe");
        myStack.push("Jane Doe");
        myStack.push("Jack Smith");
        myStack.push("Jill Smith");
        myStack.push("Jim Brown");

        assertEquals("[John Doe, Jane Doe, Jack Smith, Jill Smith, Jim Brown]", myStack.toString() );

    }

}
