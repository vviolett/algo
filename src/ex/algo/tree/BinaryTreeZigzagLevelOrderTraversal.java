package ex.algo.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(20);
        root.right.left.right = new TreeNode(17);
        zigzagLevelOrder(root);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if(leftToRight){
                    currentLevel.add(current.val);
                } else{
                    currentLevel.add(0, current.val);
                }
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!= null){
                    queue.offer(current.right);
                }
            }
            result.add(currentLevel);
            leftToRight = !leftToRight;
        }
        return result;
    }
}
