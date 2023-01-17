package QUEUES;

public class Queue_Main {
    public static void main(String[] args) {
        Queues ex1 = new Queues();


       //adding items to the queue
        ex1.enqueue(100);
        ex1.enqueue(101);
        ex1.enqueue(102);
        ex1.enqueue(103);
        ex1.enqueue(104);
        ex1.enqueue(105);
        ex1.enqueue(106);
        ex1.enqueue(107);
        ex1.enqueue(108);
        ex1.enqueue(109);

        ex1.display();

        ex1.dequeue();
        ex1.display();




    }
}
