package ex.algo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    static List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        inorderTraversal(tree);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return Collections.emptyList();

        /* first recur on left child */
        inorderTraversal(root.left);

        /* then print the data of node */
        res.add(root.val);

        /* now recur on right child */
        inorderTraversal(root.right);
        return null;
    }
}
