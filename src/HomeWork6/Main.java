package HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static class Node
    {
        int key;
        Node left, right;
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    static class BinaryTree
    {
        // Root of Binary Tree
        Node root;
        BinaryTree()
        {
            root = null;
        }
        // Print the nodes of binary tree
        void print_Postorder(Node node)
        {
            if (node == null)
                return;
            print_Postorder(node.left);
            print_Postorder(node.right);
            System.out.print(node.key + " ");
        }
        // Wrappers over above recursive functions
        void print_Postorder()
        {
            print_Postorder(root);
        }

    }
    static class TreeNode {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> lst = new ArrayList<>();
            lst.add(root.val);
            if (root.left != null){
                lst.addAll(root.left.preorderTraversal(root.left));
            }
            if (root.right != null){
                lst.addAll(root.right.preorderTraversal(root.right));
            }
            return lst;
        }
    }

    public static void  main(String[] args) {
        TreeNode root =
                new TreeNode(1,
                        null,
                        new TreeNode(2, new TreeNode(3), null));
        List<Integer> lst = new ArrayList<>(root.preorderTraversal(root));
        System.out.println(lst);
    }
}
