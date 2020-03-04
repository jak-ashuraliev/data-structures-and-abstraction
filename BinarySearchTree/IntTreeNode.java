/**
 * @author Jak Ashuraliev
 * Purpose: 
 * Binary Search Tree
 * Write a method called countLeftNodes that returns the number of left children in the tree. 
 * A left child is a node that appears as the root of the left-hand sub tree of another node.
 * Write a method called isFull that returns true if a binary tree is full and false if it is not. 
 * A full binary tree is one in which every node has 0 or 2 children. 
 * By definition, the empty tree is considered full.
 */

public class IntTreeNode {
    
    // data fields
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;
                
    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                        
    // constructs a branch node with given data, left subtree, right subtree
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

