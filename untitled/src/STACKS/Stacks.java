package STACKS;

public class Stacks {
     int stack[], top, cap;

    // Creating a stack
    Stacks(int size) {
        stack = new int[size];
        cap = size;
        top = -1;
    }

    //push operation
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            System.exit(1);
        }else {
            System.out.println(element);
            stack[++top] = element;
        }
    }

    //pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return stack[top--];
    }


    // method to check if stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // method to check if stack is full
    public Boolean isFull() {
        return top == cap - 1;
    }

    // method to display stack contents
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

}


