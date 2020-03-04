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

public class IntSearchTreeClient {
    
    public static void main(String[] args) {
      
        // 2 arrays
        int[] list = {55,29,87,-3,42,60,91};
        int[] list1 = {60,55,100,45,57};  
        
        // IntSearchTree Object
        IntSearchTree first = new IntSearchTree();
        IntSearchTree second = new IntSearchTree();
        
        // using array list build the first binary tree
        for (int i = 0; i < list.length; i++) {
            first.add(list[i]);
        }
        
        // using array list build the second binary tree
        for (int i = 0; i < list1.length; i++) {
            second.add(list1[i]);
        }
        
        //print out original array
        System.out.print("THE ORIGINAL ARRAY IS: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        
        System.out.println("TREE STRUCTURE IS: ");
        first.printSideways();
        
        System.out.print("SORTED LIST: ");
        first.print();
       
        System.out.println("THE NUMBER OF LEFT NODES IS: " + first.countLeftNodes());
        System.out.println("THIS IS A FULL BINARY TREE: " + first.isFull());
        
        
        System.out.println("\n");
        
        //print out original array
        System.out.print("THE ORIGINAL ARRAY IS: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        
        System.out.println("TREE STRUCTURE IS: ");
        second.printSideways();
        
        System.out.print("SORTED LIST: ");
        second.print();
       
        System.out.println("THE NUMBER OF LEFT NODES IS: " + second.countLeftNodes());
        System.out.println("THIS IS A FULL BINARY TREE: " + second.isFull());
        
     
    }
    
}
