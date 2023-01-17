package STACKS;

public class Stack_Main {
    public static void main(String[] args) {
        Stacks stack = new Stacks(10);

        stack.push(100);
        stack.push(101);
        stack.push(102);
        stack.push(103);
        stack.push(104);
        stack.push(105);
        stack.push(106);
        stack.push(107);
        stack.push(108);
        stack.push(109);
        stack.pop();
        System.out.println("\nAfter popping out");

        stack.display();

    }
}
