import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList myArrayList;

    @BeforeEach
    public void setUp() {
        myArrayList = new MyArrayList();

    }
    @Test
    public void newArrayListIsEmpty() {
        assertTrue(myArrayList.getIsEmpty());
    }

    @Test
    public void addNewElementToEmptyList() {
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");
        assertFalse(myArrayList.getIsEmpty());
    }
    @Test
    public void addNewElement_RemoveElement_ListIsEmptyTest(){
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");
        assertFalse(myArrayList.getIsEmpty());
        myArrayList.remove("John Doe");
        assertTrue(myArrayList.getIsEmpty());
    }

    @Test
    public void addTwoElement_RemoveOneElement_ListIsNotEmptyTest() {
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");

        assertFalse(myArrayList.getIsEmpty());
        myArrayList.remove("Jane Doe");
        assertFalse(myArrayList.getIsEmpty());
    }

    @Test
    public void removeElementFromEmptyLIst() {
        assertTrue(myArrayList.getIsEmpty());
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> myArrayList.remove("Jane Doe"));
    }

    @Test
    public void addOneElement_GetElementByIndex(){
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");

       assertEquals("John Doe", myArrayList.get(1));
    }
    @Test
    public void addFourElements_GetIndexByElementTest() {
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");

        assertEquals(2, myArrayList.get("Jane Doe"));

    }

    @Test
    public void addFourElements_GetIndexOfNonExistingElementTest() {
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");

        assertEquals(0, myArrayList.get("Jim Brown"));
    }

    @Test
    public void addThreeElements_GetSizeOfArrayListTest() {
        assertTrue(myArrayList.getIsEmpty());
        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");

        assertEquals(3, myArrayList.size());
    }

    @Test
    public void addZeroElements_GetSizeOfArrayListTest() {
        assertTrue(myArrayList.getIsEmpty());

        assertEquals(0, myArrayList.size());
    }

    @Test
    public void addFourElements_Ascertain_ElementExistsInArrayListTest() {
        assertTrue(myArrayList.getIsEmpty());

        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");

        assertTrue(myArrayList.contains("Jack Smith"));

    }

    @Test
    public void addFourElements_Ascertain_ElementDoesNotExistsInArrayListTest() {
        assertTrue(myArrayList.getIsEmpty());

        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");

        assertFalse(myArrayList.contains("Jim Brown"));

    }

    @Test
    public void addMoreThanSixElementsTest() {
        assertTrue(myArrayList.getIsEmpty());

        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");
        myArrayList.add("Jim Brown");
        myArrayList.add("Jessica Brown");

        assertEquals(6, myArrayList.size());
        assertEquals("[John Doe, Jane Doe, Jack Smith, Jill Smith, Jim Brown, Jessica Brown]", myArrayList.toString());

        myArrayList.add("James Green");
        assertEquals(7, myArrayList.size());
        assertEquals("[John Doe, Jane Doe, Jack Smith, Jill Smith, Jim Brown, Jessica Brown, James Green]", myArrayList.toString());

    }

    @Test
    public void removeElement_AscertainItIsNotThereTest() {
        assertTrue(myArrayList.getIsEmpty());

        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");

        assertEquals(4, myArrayList.size());
        assertEquals("[John Doe, Jane Doe, Jack Smith, Jill Smith]", myArrayList.toString());

        myArrayList.remove("Jane Doe");
        assertEquals(3, myArrayList.size());
        assertEquals("[John Doe, Jack Smith, Jill Smith]", myArrayList.toString());

    }

    @Test
    public void addElement_RemoveElement_DisplayArrayList() {
        assertTrue(myArrayList.getIsEmpty());

        myArrayList.add("John Doe");
        myArrayList.add("Jane Doe");
        myArrayList.add("Jack Smith");
        myArrayList.add("Jill Smith");

        assertEquals(4, myArrayList.size());
        assertEquals("[John Doe, Jane Doe, Jack Smith, Jill Smith]", myArrayList.toString());

        myArrayList.remove("Jane Doe");
        myArrayList.remove("Jill Smith");

        assertEquals(2, myArrayList.size());

        myArrayList.add("Jim Brown");
        myArrayList.add("Jessica Brown");

        assertEquals(4, myArrayList.size());
        assertEquals("[John Doe, Jack Smith, Jim Brown, Jessica Brown]", myArrayList.toString());




    }

}
