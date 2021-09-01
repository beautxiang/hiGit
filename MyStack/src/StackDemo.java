public class StackDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(1);
        myStack.list();
        System.out.printf(String.valueOf(myStack.pop()));
        System.out.printf(String.valueOf(myStack.pop()));
        System.out.printf(String.valueOf(myStack.pop()));
        System.out.printf(String.valueOf(myStack.pop()));
        System.out.printf(String.valueOf(myStack.pop()));
        System.out.printf(String.valueOf(myStack.pop()));

    }



}
