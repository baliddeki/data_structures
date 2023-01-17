package ARRAYS;

public class Array_Main {
    public static void main(String[] args) {


        Array ex1 = new Array(5);

        ex1.add(100);
        ex1.add(101);
        ex1.add(102);
        ex1.add(103);
        ex1.add(104);

        ex1.display();
        System.out.println("\n");

        ex1.find(101);

        System.out.println("\n\n");

        ex1.Delete(100);
        ex1.display();


    }
}
