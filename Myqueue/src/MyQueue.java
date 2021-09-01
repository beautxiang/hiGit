public class MyQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
        int i = 100;
    }

    //测试冲突
    public boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }

    public void addRear(int value) {
        if (isFull()) {
            System.out.println("队列满了");
            return;
        }
        rear++;
        queue[rear] = value;
    }

    public int popFront() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有可以拿出来的数据");
        }
        front++;
        return queue[front];
    }

    public int getFront() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        return queue[front + 1];
    }

}
