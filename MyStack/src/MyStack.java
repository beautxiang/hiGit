public class MyStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[this.maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满了，不能再往里填数据了");
            return;
        } else {
            top++;
            stack[top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空了，没有数据了");
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    public void list() {
        if (isEmpty()) {
            System.out.println("栈为空，栈中没有数据");
            return;
        } else {
            for (int i = maxSize - 1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }

    }
}
