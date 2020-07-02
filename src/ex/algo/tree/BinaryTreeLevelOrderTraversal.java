package ex.algo.tree;

import apple.laf.JRSUIUtils;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        levelOrderBottom(new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)))).forEach(it -> System.out.println(it));

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return Collections.emptyList();
        Deque<List<Integer>> res = new LinkedList<List<Integer>>();
        res.add(Arrays.asList(root.val));
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        Queue<TreeNode> nextLevel = new LinkedList<>();
        nextLevel.add(root);

        while(!nextLevel.isEmpty()) {
            level = new LinkedList<>(nextLevel);
            nextLevel.clear();
            while (!level.isEmpty()) {
                TreeNode node = level.remove();
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }

            if(!nextLevel.isEmpty())
            res.addFirst(nextLevel.stream().map(it -> it.val).collect(Collectors.toList()));
        }
        return new LinkedList<>(res);
    }

    static void reverseLevelOrder(TreeNode node)
    {
        Stack<TreeNode> S = new Stack();
        Queue<TreeNode> Q = new LinkedList();
        Q.add(node);

        // Do something like normal level order traversal order.Following
        // are the differences with normal level order traversal
        // 1) Instead of printing a node, we push the node to stack
        // 2) Right subtree is visited before left subtree
        while (!Q.isEmpty())
        {
            /* Dequeue node and make it root */
            node = Q.peek();
            Q.remove();
            S.push(node);

            /* Enqueue right child */
            if (node.right != null)
                Q.add(node.right);

            /* Enqueue left child */
            if (node.left != null)
                Q.add(node.left);
        }

        // Now pop all items from stack one by one and print them
        while (!S.empty())
        {
            node = S.peek();
            System.out.print(node.val + " ");
            S.pop();
        }
    }
}
