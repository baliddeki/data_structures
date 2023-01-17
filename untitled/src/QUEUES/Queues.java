package QUEUES;

public class Queues {
    int SIZE = 10, front, rear;
    int queue[] = new int[SIZE];

    //queue attributes
    Queues() {
        front = -1;
        rear = -1;

    }

    //methods to check state of queue
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }


    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    //enqueue operation
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1) {
            front = 0;
        }

            rear++;

            queue[rear] = item;
            System.out.println("the added element is "+item);
        }

    // dequeue operation
    int dequeue() {
        int item;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            System.out.println(" \n\n\n after dequeuing");

            item = queue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("The deleted element is: " + item);
            return (item);
        }

    }

    //display operation
    void display() {

        // Function to display items of Queue
        int i;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (i = front; i <= rear; i++)
                System.out.print(queue[i] +", ");
        }
    }
}





