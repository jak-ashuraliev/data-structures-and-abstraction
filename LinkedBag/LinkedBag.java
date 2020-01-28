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
    
    /** Counts the number of times a given entry appears in this bag.
     @param anEntry  The entry to be counted.
     @return  The number of times anEntry appears in the bag.*/
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        int loopCounter = 0;
        Node currentNode = firstNode;
        
        while ((loopCounter < numberOfEntries) && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                frequency++;
            } // end if
            
            loopCounter++;
            currentNode = currentNode.next;
        } // end while loop
        
        return frequency;
    }
    
    /** Tests whether this bag contains a given entry.
     @param anEntry  The entry to locate.
     @return  True if the bag contains anEntry, or false otherwise*/ 
    public boolean contains(T anEntry) {
    
        boolean found = false;
        Node current = firstNode;
        
        while (!found && (current != null)) {
            if (anEntry.equals(current.data)) {
                found = true;
            } else {
                current = current.next;
            }
        } // end while loop
        
        return found;
    } // end contains
    
    
    /** Removes one unspecified entry from this bag, if possible.
     @return  Either the removed entry, if the removal was successful, or null */
    public T remove() {
        T result = null;
        if (firstNode != null) {
            result = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
        } // end if
        
        return result;
    } // end remove
    
    public boolean remove(T anEntry) {
        boolean result = false;
        Node target = getReferenceTo(anEntry);
        
        if (target != null) {
            target.data = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
            result = true;
        }
        
        return result;
    }
    
    // Locates a given entry within this bag.
    // Returns a reference to the node containing the entry, if located,
    // or null otherwise.
    public Node getReferenceTo(T anEntry) {
        boolean found = false;
        Node current = firstNode;
        
        while (!found && (current != null)) {
            if (anEntry.equals(current.data)) {
                found = true;
            } else {
                current = current.next;
            }
        }
        
        return current;
    }
    
    //Remove Every
    public void removeEvery(T anEntry) {
        Node current = firstNode;
        
        if (current == null) {
            return;
        }
        if (current.data == anEntry) {
            current = current.next;
            numberOfEntries--;
        }
        
        while (current.next != null) {
            if (current.next.data == anEntry) {
                remove(anEntry);
            }
            current = current.next;
        }
    }
    
    //Replace
    public void replace(T anEntry) {
        if (firstNode != null) {
            remove();
            add(anEntry);
        }
    }
    
    /** Sees whether this bag is empty.       
     @return  True if this bag is empty, or false if not. */  
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    
    /** Removes all entries from this bag.  */
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }
    
    /** Retrieves all entries that are in this bag.
     @return  A newly allocated array of all the entries in the bag. */
    public T[] toArray() {
        
        // The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        
        int index = 0;
        Node currentNode = firstNode;
        
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        } // end while
        
        return result;
    } // end toArray
    
    //toString method
    public String toString() {
        if (firstNode == null) {
            return null;
        } else {
            String result = "" + firstNode.data;
            Node current = firstNode.next;
            
            while (current != null) {
                result += " " + current.data;
                current = current.next;
            }
            
            return result;
        }
    }
}
