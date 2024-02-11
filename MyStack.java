package Stack;

import java.util.EmptyStackException;

public class MyStack {

    private String[] stack;

    private int capacity;

    private int numberOfElements;
    public MyStack(int capacity) {
        this.capacity = capacity;
        stack = new String[capacity];
    }

    public boolean getIsEmpty() {
        return numberOfElements == 0;
    }

    public void push(String element) {
        if (numberOfElements == capacity){
            throw new StackOverflowError("Stack is full");
        }
        stack[numberOfElements] = element;
        numberOfElements++;

    }

    public String pop() {
        if (numberOfElements == 0){
            throw new EmptyStackException();
        }
        return stack[--numberOfElements];
    }

    public int size() {
        return numberOfElements;
    }

    public String peek() {
        if (numberOfElements == 0){
            throw new EmptyStackException();
        }
        return stack[numberOfElements - 1];
    }

    @Override
    public String toString() {
        String myStack = "[";
        for (int count = 0; count < numberOfElements; count++){
             myStack += stack[count];

             if (count != numberOfElements - 1) {
                 myStack += ", ";
             }
        }
        myStack+= "]";

        return myStack;
    }
}
