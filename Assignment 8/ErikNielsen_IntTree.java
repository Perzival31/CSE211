// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder or postorder traversal.  The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."


import java.util.*;

public class IntTree {
    private IntTreeNode overallRoot;

    // pre : max > 0
    // post: constructs a sequential tree with given number of
    //       nodes
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless
    //       n is greater than max, in which case it returns an
    //       empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max),
                                   buildTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints the tree contents using a preorder traversal
    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth; prints right to left so that it looks
    //       correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
    //Exercise 1
    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    public int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        } 
        
        else if (root.left != null) {
            return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
        } 
        
        else {
            return countLeftNodes(root.right);
        }  
    }
    //Exercise 5
    public void printLevel(int n) {
        if(n < 1)
            throw new IllegalArgumentException();
            
        printLevel(overallRoot, n);
    }

    private void printLevel(IntTreeNode node, int n) {
        if(node == null)
            return;
            
        if(n == 1) {
            System.out.println(node.data);
            return;
        }
        
        printLevel(node.left, n - 1);
        printLevel(node.right, n - 1);
    }
    //Exercise 8
    public String toString2() {
        return toString2(overallRoot);
    }

    public String toString2(IntTreeNode root) {
        if (root == null) {
            return "empty";
            
        } else if (root.left == null && root.right == null) {
            return "" + root.data;
            
        } else {
            return "(" + root.data + ", " + toString2(root.left) + ", " + toString2(root.right) + ")";
        }
    }
}