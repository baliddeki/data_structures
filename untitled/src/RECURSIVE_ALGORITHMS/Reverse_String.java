package RECURSIVE_ALGORITHMS;

import java.util.Scanner;

public class Reverse_String {
    public String reverseString(String input) {
        if (input.equals("")) { //basecase
            return "";
        }
    return
            //method "reverseString" calling itself
            //substring method returns the new string that is a substring of the specified string
            //charAt returns a character at the specified index parsed in.
    reverseString(input.substring(1))+input.charAt(0);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the string you'd want to reverse: ");
        String input = scan.next();
        Reverse_String recur = new Reverse_String();
      String reversedString = recur.reverseString(input);
        System.out.println(reversedString);
    }

}
//OUTPUT
//ELUGARD