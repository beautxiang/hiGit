import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class Solution {
    private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Solution solution = new Solution();
        int[] a = new int[]{5, 1, 1};
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(1);
        String[] strings = new String[]{"a", "b", "c"};
        List<String> list = Arrays.asList(strings);
        System.out.println(solution.triangleNumber(new int[]{2, 3, 4, 4}));



    }

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i >= 2; i--) {
            int l = 0;
            int r = i - 1;
            while (r > l) {
                if (nums[l] + nums[r] > nums[i]) {
                    count += (r - l);
                    r--;
                } else {
                    l++;
                }
            }
        }
        return count;
    }


}




class Elf {

    public Elf(int HP, int attackValue, int defensiveValue, String name) {
        this.HP = HP;
        this.attackValue = attackValue;
        this.defensiveValue = defensiveValue;
        this.name = name;
    }

    public Elf() {
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDefensiveValue() {
        return defensiveValue;
    }

    public void setDefensiveValue(int defensiveValue) {
        this.defensiveValue = defensiveValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int HP;

    private int attackValue;

    private int defensiveValue;

    private String name;

    public void attack(Elf other) {
        other.HP -= this.attackValue - other.defensiveValue;
    }

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public final void test() {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

enum Color {
    RED, GREEN, BLUE;
}

