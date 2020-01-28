/**
 * @author Jak Ashuraliev
 * Data Structures / Algorithms 
 * 
 * Purpose:
 * LinkedBag (A bag implementation that links data)
 */

public class LinkedBagTest {
    
    public static void main(String[] args) {
        
        String[] contentsOfBag = {"A", "D", "B", "A", "C", "A", "D"};
        LinkedBag<String> bag = new LinkedBag<>();
        
        System.out.println("Creating an empty bag.");
        System.out.println("Adding to the bag: A D B A C A D");
        testAdd(bag, contentsOfBag);
        System.out.println("The bag contains " + bag.getCurrentSize() + " string(s), as follows:");
        System.out.println(bag);
        testIsEmpty(bag, bag.isEmpty());
        
        System.out.println("\nTesting the method getFrequencyOf:");
        System.out.println("In this bag, the count of A is " + bag.getFrequencyOf("A"));
        System.out.println("In this bag, the count of D is " + bag.getFrequencyOf("D"));
        System.out.println("In this bag, the count of B is " + bag.getFrequencyOf("B"));
        System.out.println("In this bag, the count of A is " + bag.getFrequencyOf("A"));
        System.out.println("In this bag, the count of C is " + bag.getFrequencyOf("C"));
        System.out.println("In this bag, the count of A is " + bag.getFrequencyOf("A"));
        System.out.println("In this bag, the count of D is " + bag.getFrequencyOf("D"));
        
        System.out.println("\nTesting the method contains:");
        System.out.println("Does this bag contain A? " + bag.contains("A"));
        System.out.println("Does this bag contain D? " + bag.contains("D"));
        System.out.println("Does this bag contain B? " + bag.contains("B"));
        System.out.println("Does this bag contain A? " + bag.contains("A"));
        System.out.println("Does this bag contain C? " + bag.contains("C"));
        System.out.println("Does this bag contain A? " + bag.contains("A"));
        System.out.println("Does this bag contain D? " + bag.contains("D"));
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        
        System.out.println("\nRemoving a string from the bag:");
        System.out.println("remove() returns " + bag.remove());
        System.out.println("The bag contains " + bag.getCurrentSize() + " string(s)");
        
        System.out.println("\nAdding to the bag: A D B A C A D");
        testAdd(bag, contentsOfBag);
        System.out.println("The bag contains " + bag.getCurrentSize() + " string(s), as follows:");
        System.out.println(bag);
        
        System.out.println("\nRemove an entry B from the bag:" + bag.remove("B"));
        System.out.println("The bag contains " + bag.getCurrentSize() +" string(s), as follows:");
        System.out.println(bag);
       
        System.out.println("\nClearing the bag:");
        bag.clear();
        testIsEmpty(bag, bag.isEmpty());
        
        System.out.println("\nThe bag contains " + bag.getCurrentSize() + " string(s)");
        System.out.println("\nAdding to the bag: A D B A C A D");
        testAdd(bag, contentsOfBag);
        System.out.println("The bag contains " + bag.getCurrentSize() + " string(s), as follows:");
        System.out.println(bag);
        
        System.out.println("\nReplace unspecified entry in the bag with the entry Z:");
        bag.replace("Z");
        System.out.println("The bag contains " + bag.getCurrentSize() + " string(s), as follows:");
        System.out.println(bag);
        
        System.out.println("\nRemove every occurrence of the entry A from the bag:");
        bag.removeEvery("A");
        System.out.println("The bag contains " + bag.getCurrentSize() + " string(s), as follows:");
        System.out.println(bag);

    }
    
    
    public static void testIsEmpty(LinkedBag<String> bag, boolean empty) {
        
        System.out.print("Testing isEmpty with ");
        if (empty) {
            System.out.print("an empty bag:\n");
        } else {
            System.out.print("a bag that is not empty:\n");
        }
            
        System.out.print("isEmpty finds the bag ");
        if(empty && bag.isEmpty()) {
            System.out.println("empty: OK.");
        } else if (empty) {
            System.out.print("not empty, but it is: Error.");
        } else if (!empty && bag.isEmpty()) {
            System.out.print("empty, but it is not empty: Error.");
        } else {
            System.out.println("not empty: OK.");
        }
    }
    
    
    public static void testAdd(LinkedBag<String> aBag, String [] contents) {
        for (String i : contents) {
            aBag.add(i);
        }
    }
    
}

