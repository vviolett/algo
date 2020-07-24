package ex.algo.tree;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageofLevelsinBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        averageOfLevels(root);
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double sumLevel = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                sumLevel += current.val;

                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!= null){
                    queue.offer(current.right);
                }
            }
            result.add(sumLevel/levelSize);
        }

        return result;
    }
}
