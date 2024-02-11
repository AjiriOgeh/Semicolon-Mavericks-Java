import MySet.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    private MySet mySet;

    @BeforeEach
    public void setUp() {
        mySet = new MySet();

    }

    @Test
    public void newSetIsEmptyTest() {
        assertTrue(mySet.getIsEmpty());
    }

    @Test
    public void addElementToSetTest() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        assertFalse(mySet.getIsEmpty());

    }
    @Test
    public void addElementToSet_RemoveElementTest() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");

        assertFalse(mySet.getIsEmpty());
        mySet.remove("John Doe");
        assertTrue(mySet.getIsEmpty());


    }

    @Test
    public void addTwoElementsToSet_RemoveOneElement() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");

        assertFalse(mySet.getIsEmpty());

        mySet.remove("Jane Doe");
        assertFalse(mySet.getIsEmpty());
    }

    @Test
    public void addFourElements_GetSizeOfSetTest(){
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");
        mySet.add("Jack Smith");
        mySet.add("Jill Smith");

        assertFalse(mySet.getIsEmpty());
        assertEquals(4, mySet.size());
    }

    @Test
    public void addTwoElementsToSet_RemoveOneElement_AddNewElement() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");

        assertFalse(mySet.getIsEmpty());

        mySet.remove("John Doe");
        assertFalse(mySet.getIsEmpty());

    }

    @Test
    public void addThreeElements_Ascertain_ElementExistsInSetTest() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");
        mySet.add("Jack Smith");
        mySet.add("Jill Smith");

        assertFalse(mySet.getIsEmpty());

        assertTrue(mySet.contains("Jack Smith"));

    }

    @Test
    public void addThreeElements_Ascertain_ElementDoesNotExistsInSetTest() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");
        mySet.add("Jack Smith");
        mySet.add("Jill Smith");

        assertFalse(mySet.getIsEmpty());

        assertFalse(mySet.contains("Jim Brown"));

    }
    @Test
    public void addMoreThanFourElementsToSet() {
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");
        mySet.add("Jack Smith");
        mySet.add("Jill Smith");

        assertFalse(mySet.getIsEmpty());
        assertEquals(4, mySet.size());

        mySet.add("Jim Brown");
        assertEquals(5, mySet.size());

    }

    @Test
    public void addFourElements_Ascertain_DuplicateCannotBeAddedTest(){
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");
        mySet.add("Jack Smith");
        mySet.add("Jill Smith");

        assertFalse(mySet.getIsEmpty());
        assertEquals(4, mySet.size());

        mySet.add("John Doe");

        assertFalse(mySet.getIsEmpty());
        assertEquals(4, mySet.size());

    }

    @Test
    public void addFourElements_RemoveOne_Ascertain_ElementIsNoTThereTest(){
        assertTrue(mySet.getIsEmpty());

        mySet.add("John Doe");
        mySet.add("Jane Doe");
        mySet.add("Jack Smith");
        mySet.add("Jill Smith");

        assertFalse(mySet.getIsEmpty());
        assertEquals(4, mySet.size());

        mySet.remove("Jane Doe");

        assertEquals("[John Doe, Jack Smith, Jill Smith]", mySet.toString());
        assertEquals(3, mySet.size());

    }
}
