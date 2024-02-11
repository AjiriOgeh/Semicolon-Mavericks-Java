public class MyArrayList {
    private int numberOfElements;
    private String[] arrayList = new String[6];

    public boolean getIsEmpty() {
        return numberOfElements == 0;
    }

    public void add(String element) {
            arrayList[numberOfElements] = element;
            numberOfElements++;
            if (numberOfElements >= 6) {
                newArrayList();
            }
    }

    public void newArrayList() {
        String[] newArrayList = new String[numberOfElements + 5];

        for(int count = 0; count < numberOfElements; count++ ){
            newArrayList[count] =  arrayList[count];
        }

        arrayList = newArrayList;
    }

    public void remove(String element) {
        if (numberOfElements == 0) throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        int index = 0;

        for (int count = 0; count < numberOfElements; count++) {
            if (!element.equals(arrayList[count])){
                arrayList[index] = arrayList[count];
                index++;
            }
        }
        numberOfElements--;
    }


    public String get(int index) {
        return arrayList[index - 1];
    }

    public int get(String element) {
        int index = 0;
        for (int count = 0; count < arrayList.length; count++){
            if (element.equals(arrayList[count]))
                index =  count + 1;

        }
            return index;

    }

    @Override
    public String toString() {
        String myArrayList = "[";
        for (int count = 0; count < numberOfElements; count++){
            myArrayList += arrayList[count];
            if (count < numberOfElements - 1) {
                myArrayList += ", ";
            }
        }
        myArrayList += "]";


        return myArrayList;
    }

    public int size() {
        return numberOfElements;
    }

    public boolean contains(String element) {
        boolean itContains = false;
        for (int count = 0; count < numberOfElements; count++) {
            if (element.equals(arrayList[count])){
                itContains = true;
                break;
            }
        }
        return itContains;
    }
}
