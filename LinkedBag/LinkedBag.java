/**
 * @author Jak Ashuraliev
 * Data Structures / Algorithms
 * 
 * LinkedBag (A bag implementation that links data)
 * @param <T>
 */


public final class LinkedBag<T> implements BagInterface<T>{
    
    //data field
    private Node firstNode;
    private int numberOfEntries;
    
    //constructor
    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }
    
    //nested nodes
    private class Node {
        
        //data field
        private T data;     // entry in bag
        private Node next;  // link to next node
        
        //constructor
        private Node(T dataPortion) {
            this(dataPortion, null);
        } //end constructor
        
        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
        
        private T getData() {
            return data;
        }
        
        private void setData(T newData) {
            data = newData;
        }
        
        private Node getNextNode(Node nextNode) {
            return next;
        }
        
        private void setNextNode(Node nextNode) {
            next = nextNode;
        }
    } // end Node
    
    
    /** Adds a new entry to this bag.
     @param newEntry  The object to be added as a new entry.
     @return  True. */
    
    public boolean add(T newEntry) {
    
        //add to begining of chain:
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;
        
        firstNode = newNode;
        numberOfEntries++;
        return true;
    } // end add
    
    
    /** Gets the size of the bag */
    public int getCurrentSize() {
        int count = 0;
        Node current = firstNode;
        
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
