package RECURSIVE_ALGORITHMS;

public class Binary_Conversion {
    public static String toBinary(int decimal, String result) {
        if (decimal == 0) {
            return result;

        }
        result = decimal % 2 + result;
        return toBinary(decimal / 2, result);

    }

    public static void main(String[] args) {
        Binary_Conversion ex1 = new Binary_Conversion();
        String four = ex1.toBinary(233, "");
        System.out.println(four);
    }
}
