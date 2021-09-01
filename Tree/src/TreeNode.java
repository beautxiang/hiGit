import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    private int i;
    private String content;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int i, String content) {
        this.i = i;
        this.content = content;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void levelTraversal() {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(this);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            System.out.println(treeNode);
            if (treeNode.leftNode != null) {
                queue.offer(treeNode.leftNode);
            }
            if (treeNode.rightNode != null) {
                queue.offer(treeNode.rightNode);
            }
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "i=" + i +
                ", content='" + content + '\'' +
                '}';
    }
}
