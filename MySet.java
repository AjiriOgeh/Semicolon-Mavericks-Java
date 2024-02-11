package MySet;

public class MySet {
    private int numberOfElements;

    private String[] set = new String[4];

    public boolean getIsEmpty() {
        return numberOfElements == 0;
    }

    public void add(String element) {

        if (numberOfElements >= 4)
            newSet();

        if (!contains(element)) {
            set[numberOfElements] = element;
            numberOfElements++;
        }
    }

    public void newSet() {
        String[] newSet = new String[numberOfElements + 5];
        for(int count = 0; count < numberOfElements; count++){
            newSet[count] = set[count];
        }

        set = newSet;
    }

    public void remove(String element) {
        if (numberOfElements == 0) throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        int index = 0;

        for (int count = 0; count < numberOfElements; count++) {
            if (!element.equals(set[count])){
                set[index] = set[count];
                index++;
            }
        }
        numberOfElements--;
    }

    public int size() {
        return numberOfElements;
    }

    public boolean contains(String element) {
        for (String elementInSet : set) {
            if (element.equals(elementInSet)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String mySet = "[";
        for (int count = 0; count < numberOfElements; count++){
            mySet += set[count];
            if (count < numberOfElements - 1) {
                mySet += ", ";
            }
        }
        mySet += "]";

        return mySet;
    }

}
