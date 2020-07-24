package ex.algo.tree;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
//        root.right.right = new TreeNode(5);
        System.out.println(minDepth(root));

    }

    public static int minDepth(TreeNode root) {
        int result = 0;
        if(root == null){
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if(current.left== null && current.right== null){
                    return ++result;
                }

                if(current.left!= null){
                    queue.offer(current.left);
                }
                if(current.right!= null){
                    queue.offer(current.right);
                }
            }
            result++;
        }
        return result;
    }
}
