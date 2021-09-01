import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = new Node(-1);
    }

    public void insertTail(Node node) {
        Node temp = head;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = node;
    }

    public void printList() {
        Node temp = head.nextNode;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.nextNode;
        }
    }

    public void addByOrder(Node node) {
        Node temp = head;
        boolean isExist = false;
        while (true) {
            if (temp.nextNode == null || temp.nextNode.value > node.value) {
                break;
            } else if (temp.nextNode.value == node.value) {
                isExist = true;
                break;
            }
            temp = temp.nextNode;
        }
        if (isExist) {
            System.out.println("要添加的编号已经存在了");
        } else {
            node.nextNode = temp.nextNode;
            temp.nextNode = node;
        }
    }

    public void delete(int x) {
        Node temp = head;
        boolean isFind = true;
        while (true) {
            // 找到了节点
            if (temp.nextNode == null) {
                isFind = false;
                break;
            } else if (temp.nextNode.value == x) {
                break;
            }
            temp = temp.nextNode;
        }
        // 如果找到了节点
        if (isFind) {
            temp.nextNode = temp.nextNode.nextNode;
        } else {
            System.out.print("没有找到该节点的信息");

        }
    }

    public void deleteX(int x) {
        Node temp = head;
        while (temp.nextNode != null) {
            if (temp.nextNode.value == x) {
                temp.nextNode = temp.nextNode.nextNode;
                continue;
            }
            temp = temp.nextNode;
        }
    }

    public void inversePrint() {
        Node temp = head.nextNode;
        Stack<Node> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.nextNode;
        }

        while (!stack.empty()) {
            Node pop = stack.pop();
            System.out.println(pop.value);
        }
    }

    public void deleteMin() {
        Node temp = head;
        Node minPre = head;
        while (temp.nextNode != null) {
            if (temp.nextNode.value < minPre.nextNode.value) {
                minPre = temp;
            }
            temp = temp.nextNode;
        }
        minPre.nextNode = minPre.nextNode.nextNode;
    }

    public void inverseLink() {
        Node cur = head.nextNode;
        head.nextNode = null;
        Node pre = head;
        Node post;
        while (cur != null) {
            post = cur.nextNode;
            cur.nextNode = pre;
            pre = cur;
            cur = post;
        }
        head = pre;
    }

    public void deleteBetween(int min, int max) {
        Node temp = head;
        while (temp.nextNode != null) {
            if (temp.nextNode.value > min && temp.nextNode.value < max) {
                temp.nextNode = temp.nextNode.nextNode;
                continue;
            }
            temp = temp.nextNode;
        }
    }

    public void increaseOutput() {
        while (head.nextNode != null) {
            Node temp = head;
            Node minPre = head;
            while (temp.nextNode != null) {
                if (temp.nextNode.value < minPre.nextNode.value) {
                    minPre = temp;
                }
                temp = temp.nextNode;
            }
            System.out.println(minPre.nextNode.value);
            minPre.nextNode = minPre.nextNode.nextNode;
        }
    }

    public static List<LinkedList> inTow(LinkedList linkedList) {
        List<LinkedList> list = new ArrayList<>();
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Node temp = linkedList.head.nextNode;
        while (temp != null) {
            if (temp.value % 2 == 0) {
                Node pre = temp;
                temp = temp.nextNode;
                pre.nextNode = null;
                linkedList2.insertTail(pre);
            } else {
                Node pre = temp;
                temp = temp.nextNode;
                pre.nextNode = null;
                linkedList1.insertTail(pre);
            }

        }
        list.add(linkedList1);
        list.add(linkedList2);
        return list;
    }

    public static List<LinkedList> inTwo2(LinkedList linkedList) {
        List<LinkedList> list = new ArrayList<>();
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Node head = linkedList.head.nextNode;
        Node temp = null;
        Node post = null;
        int count = 1;
        while (head != null) {
            post = head.nextNode;
            temp = head;
            temp.nextNode = null;
            // 如果是奇数，加到第一个链表中
            if (count % 2 == 1) {
                linkedList1.insertTail(temp);
            } else {
                linkedList2.insertTail(temp);
            }
            head = post;
            count++;
        }
        list.add(linkedList1);
        list.add(linkedList2);
        return list;
    }

    public void deleteRepeat() {
        Node pre = head;
        Node cur = head.nextNode;
        while (cur != null) {
            if (pre.value == cur.value) {
                pre.nextNode = cur.nextNode;
            } else {
                pre = cur;
            }
            cur = cur.nextNode;
        }
    }

    public static LinkedList mergeDecrease(LinkedList linkedList1, LinkedList linkedList2) {
        LinkedList linkedList = new LinkedList();
        boolean flag = false;
        Node cur1 = linkedList1.head.nextNode;
        Node cur2 = linkedList2.head.nextNode;
        Node temp = null;
        Node post = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.value <= cur2.value) {
                post = cur1.nextNode;
                temp = cur1;
                temp.nextNode = null;
                linkedList.insertTail(temp);
                cur1 = post;
            } else {
                post = cur2.nextNode;
                temp = cur2;
                temp.nextNode = null;
                linkedList.insertTail(temp);
                cur2 = post;
            }
        }
        if (cur1 == null) {
            while (cur2 != null) {
                post = cur2.nextNode;
                temp = cur2;
                temp.nextNode = null;
                linkedList.insertTail(temp);
                cur2 = post;
            }
        } else {
            while (cur1 != null) {
                post = cur1.nextNode;
                temp = cur1;
                temp.nextNode = null;
                linkedList.insertTail(temp);
                cur1 = post;
            }
        }
        return linkedList;
    }

    public static LinkedList createLinkedList(LinkedList linkedList1, LinkedList linkedList2) {
        LinkedList linkedList = new LinkedList();
        Node cur1 = linkedList1.head.nextNode;
        Node cur2 = linkedList2.head.nextNode;
        Node temp = null;
        Node post = null;
        Integer value = -1;
        while (cur1 != null && cur2 != null) {
            if (cur1.value == cur2.value) {
                if (cur1.value == value) {
                    cur1 = cur1.nextNode;
                    cur2 = cur2.nextNode;
                }
                post = cur1.nextNode;
                temp = cur1;
                temp.nextNode = null;
                value = cur1.value;
                linkedList.insertTail(temp);
                cur1 = post;
                cur2 = cur2.nextNode;
            } else if (cur1.value < cur2.value) {
                cur1 = cur1.nextNode;
            } else {
                cur2 = cur2.nextNode;
            }
        }
        return linkedList;
    }

    public static boolean isSubSeq(LinkedList linkedListA, LinkedList linkedListB) {
        Node headB = linkedListB.head.nextNode;
        Node curA = linkedListA.head.nextNode;
        Node curB = linkedListB.head.nextNode;
        boolean flag = false;
        while (curA != null) {
            if (curA.value == curB.value) {
                curA = curA.nextNode;
                curB = curB.nextNode;
                if (curB == null) {
                    flag = true;
                    break;
                }
            } else {
                curA = curA.nextNode;
                curB = headB;
            }
        }
        return flag;
    }
}



class Node {
    int value;
    Node nextNode;

    public Node(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}