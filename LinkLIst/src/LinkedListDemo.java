import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
//        Node node10 = new Node(5);
//        Node node11 = new Node(2);
//        Node node12 = new Node(3);

//        linkedList1.insertTail(node1);
//        linkedList1.insertTail(node2);
//        linkedList1.insertTail(node3);
//        linkedList1.insertTail(node4);
        linkedList1.insertTail(node5);
        linkedList1.insertTail(node6);
        linkedList1.insertTail(node7);
        linkedList1.insertTail(node8);
        linkedList1.insertTail(node9);
//        linkedList.insertTail(node10);
//        linkedList.insertTail(node11);
//        linkedList.insertTail(node12);
//        linkedList.printList();
//        System.out.println("-----------------");
//        linkedList.deleteRepeat();
//        System.out.println("------------------");
//        linkedList.printList();

        Node node10 = new Node(5);
        Node node11 = new Node(6);
        Node node12 = new Node(7);
        Node node13 = new Node(8);
        Node node14 = new Node(9);
        Node node15 = new Node(10);
        Node node16 = new Node(11);
        Node node17 = new Node(12);
        Node node18 = new Node(13);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertTail(node10);
        linkedList2.insertTail(node11);
        linkedList2.insertTail(node12);
        linkedList2.insertTail(node13);
        linkedList2.insertTail(node14);
        linkedList2.insertTail(node15);
        linkedList2.insertTail(node16);
        linkedList2.insertTail(node17);
        linkedList2.insertTail(node18);

        linkedList1.printList();
        System.out.println("---------------------");;
        linkedList2.printList();
        System.out.println("---------------------");
        boolean subSeq = LinkedList.isSubSeq(linkedList2, linkedList1);
        System.out.println(subSeq);

    }

}
