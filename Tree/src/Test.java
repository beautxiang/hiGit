public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0, "0");
        TreeNode tree1 = new TreeNode(1, "1");
        TreeNode tree2 = new TreeNode(2, "2");
        TreeNode tree3 = new TreeNode(3, "3");
        TreeNode tree4 = new TreeNode(4, "4");
        TreeNode tree5 = new TreeNode(5, "5");
        TreeNode tree6 = new TreeNode(6, "6");
        TreeNode tree7 = new TreeNode(7, "7");
        TreeNode tree8 = new TreeNode(8, "8");
        TreeNode tree9 = new TreeNode(9, "9");
        root.setLeftNode(tree1);
        root.setRightNode(tree2);
        tree1.setLeftNode(tree3);
        tree1.setRightNode(tree4);
        tree2.setLeftNode(tree5);
        tree2.setRightNode(tree6);
        tree3.setLeftNode(tree7);
        tree3.setRightNode(tree8);
        tree4.setLeftNode(tree9);


        System.out.println(tree3.getLeftNode());
        System.out.println(tree4.getRightNode());

        root.levelTraversal();

    }
}
