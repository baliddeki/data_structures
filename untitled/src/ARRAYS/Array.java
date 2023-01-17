package ARRAYS;

public class Array {

    int[] array;
    int size = 0;
    int index = 0, cap;

    public Array(int cap) {
        array = new int[cap];
        this.cap = cap;
    }

    public void add(int value) {
        //add if size isn't equal to cap
        if(size != cap) {
            array[index] = value;
            size++;
            index++;
        }
        else {
            System.out.println("The array is full");
        }
    }

    public int find(int value) {
        //returns -1 if value isn't found in the array after search
        int index = -1;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        return index;
    }

    public void Delete(int value) {
        //here, we create a new(duplicate array) where a deleted value in
        //in the previous array is not presented but the cap reduces by
        int[] newArray = new int[cap - 1];

        int index = 0;
        for(int i = 0; i < this.array.length; i ++) {
            if(array[i] != value) {
                newArray[index] = array[i];
                index++;
            }
        }

        array = newArray;
    }

    public void display() {
        for(int i : array) {
            System.out.print(i + "\n ");
        }

        System.out.println();
    }
}
