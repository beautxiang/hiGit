public class MyQueueDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(6);
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.isEmpty());
        myQueue.addRear(1);
        myQueue.addRear(2);
        myQueue.addRear(3);
        myQueue.addRear(4);
        myQueue.addRear(5);
        myQueue.addRear(6);
        myQueue.addRear(7);
        System.out.println(myQueue.isFull());
        myQueue.addRear(7);
        myQueue.addRear(7);
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());
        System.out.println(myQueue.popFront());


    }
}
