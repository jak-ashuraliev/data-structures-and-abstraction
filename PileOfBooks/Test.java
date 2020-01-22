/**
 * @author Jak Ashuraliev
 * Data Structures / Algorithms
 * 
 * Purpose:
 * Implementaion of BagInterface.
 * Define a class PileOfBooks that implements this interface. 
 * Then write a program that adequately demonstrates your implementation.
 * In this program, you will need to have 1 class with the name as PileOfBooks, 
 * 1 interface with the name as PileInterface,  and 1 test class to test everything.
 */

public class Test {
    
    public static void main(String[] args) {
    
        PileOfBooks<String> myPile = new PileOfBooks<>();
        
        System.out.println("Create and empty pile of books:");
        System.out.println("isEmpty() returns: " + myPile.isEmpty()); 
        
        myPile.add("And Then There Were None");
        myPile.add("The Hobbit");
        myPile.add("The Lord of the Rings");
        myPile.add("The Da Vinci Code");
        myPile.add("The Catcher in the Rye");

        System.out.println("Add to pile.");
        System.out.println("isEmpty() returns: " + myPile.isEmpty());         
        System.out.println("Testing peek and pop:");	
        System.out.println(myPile.getTopBook() + " is at the TOP of the pile.");	
        System.out.println(myPile.remove() + " is REMOVED from the pile.");
        System.out.println();        
        System.out.println(myPile.getTopBook() + " is at the TOP of the pile.");	
        System.out.println(myPile.remove() + " is REMOVED from the pile.");
        System.out.println();    
        System.out.println(myPile.getTopBook() + " is at the TOP of the pile.");
        System.out.println(myPile.remove() + " is REMOVED from the pile.");
        System.out.println();    
        System.out.println(myPile.getTopBook() + " is at the TOP of the pile.");
        System.out.println(myPile.remove() + " is REMOVED from the pile.");
        System.out.println();
        System.out.println(myPile.getTopBook() + " is at the TOP of the pile.");	
        System.out.println(myPile.remove() + " is REMOVED from the pile.");
        System.out.println();
        System.out.println("The pile should be empty:");
        System.out.println("isEmpty() returns: " + myPile.isEmpty()); 
        System.out.println();
        System.out.println("Add to pile. ");
        myPile.add("The Catcher in the Rye");
        System.out.println("Testing clear:");
        myPile.clear();
        System.out.println("The pile should be empty: isEmpty() returns: " + myPile.isEmpty()); 	
        System.out.println("myPile.getTopBook() returns: " + myPile.getTopBook()); 	
        System.out.println("myPile.remove() returns: " + myPile.remove());
        System.out.println("Done.");
        
        
    }
    
}
