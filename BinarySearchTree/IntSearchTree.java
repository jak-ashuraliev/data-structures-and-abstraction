/**
 * @author Jak Ashuraliev
 * Purpose: 
 * Binary Search Tree
 * Write a method called countLeftNodes that returns the number of left children in the tree. 
 * A left child is a node that appears as the root of the left-hand sub tree of another node.
 * Write a method called isFull that returns true if a binary tree is full and false if it is not. 
 * A full binary tree is one in which every node has 0 or 2 children. 
 * By definition, the empty tree is considered full.
 * @param <E>
 */

public class IntSearchTree <E extends Comparable<E>> {
    
    private IntTreeNode overallRoot;

    // post: constructs an empty tree
    public IntSearchTree() {
        overallRoot = null;
    }

    // post: value is added to overall tree
    public void add(int value) {
        overallRoot = add(overallRoot, value);
    }

    // post: value is added to given tree 
    private IntTreeNode add(IntTreeNode root, int value) {
        if (root == null) {
            root = new IntTreeNode(value);
        } else if (value <= root.data) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    // post: returns true if overall tree contains value
    public boolean contains(int value) {
        return contains(overallRoot, value);
    }   

    // post: returns true if given tree contains value
    private boolean contains(IntTreeNode root, int value) {
        if (root == null) {
            return false;
        } else if (value == root.data) {
            return true;
        } else if (value < root.data) {
            return contains(root.left, value);
        } else {  // value > root.data
            return contains(root.right, value);
        }
    }

    // countLeftNodes method
    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    } 
    
    private int countLeftNodes(IntTreeNode root) {
        
        if(root == null) 
            return 0;
		
	int count = 0;
        
    	if(root.left != null) 
            count += 1 + countLeftNodes(root.left);    

	if(root.right != null)
            count += countLeftNodes(root.right);

	return count;
    }

    
    // isFull() method
    public boolean isFull() {
    
        if (overallRoot == null)
            return true;
        return _isFull(overallRoot);
    }

    public boolean _isFull(IntTreeNode node) {
        if (node == null)
            return true;
        if ((node.left == null && node.right == null) || (node.left != null && node.right != null)) {
            return _isFull(node.left) && _isFull(node.right);
        } 
    return false;
    }
    

    // post: prints the tree contents using an inorder traversal
    public void print() {
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints contents of the tree with given root using an inorder traversal
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " " );
            printInorder(root.right);
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
    
    
}