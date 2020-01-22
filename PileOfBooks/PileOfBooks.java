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
 * @param T
 */
import java.util.*;

public final class PileOfBooks<T> implements PileInterface<T> {
    
    private T[] bag;
    private int numberOfEntries;
    private boolean integrityOK = false;
    private static final int MAX_CAPACITY = 10000;
    private static final int DEFAULT_CAPACITY = 5;
    
    //create an empty bag with max capacity
    public PileOfBooks() {
        this(DEFAULT_CAPACITY);
    }
    
    /** Creates an empty bag having a given initial capacity.
     * @param desiredCapacity  The integer capacity desired. */
    public PileOfBooks(int desiredCapacity) {
        if (desiredCapacity <= MAX_CAPACITY) {
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[]) new Object[desiredCapacity];
            bag = tempBag;
            numberOfEntries = 0;
            integrityOK = true;
        } else {
            throw new IllegalStateException("Attempt to create a bag whose capacity exeeds allowed " +
                    "maximum of " + MAX_CAPACITY);
        }
      
    }
   
    // Returns true if the ArrayBag is full, or false it not.
    private boolean isArrayFull(){
        return numberOfEntries >= bag.length;
    }
    
    // Throws an exception if this object is not initialized.
    private void checkIntegrity() {
        if (!integrityOK) 
            throw new SecurityException("ArrayBag object is corrupt."); 
    }

    // Throws an exception if the client requests a capacity that is too large.
    private void checkCapacity(int capacity) {
        if (capacity > MAX_CAPACITY) 
            throw new IllegalStateException("Capacity you are trying to create is too large.");
    }
    
    // Doubles the size of the array bag.
    // Precondition: checkIntegrity has been called.
    private void doubleCapacity(){
        int newLength = 2 * bag.length;
        checkCapacity(newLength);
        bag = Arrays.copyOf(bag, newLength);
    }
    
    /** Adds a new entry to this bag.
     * @param newEntry  The object to be added as a new entry.
     * @return  True if the addition is successful, or false if not. */
    @Override
    public boolean add(T newEntry){
        checkIntegrity();
        boolean result = true;
        if (isArrayFull()) {
            result = false;
            doubleCapacity();
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }
    
    /** Removes one unspecified entry from this bag, if possible.
     * @return  Either the removed entry, if the removal was successful, or null. */
    @Override
    public T remove(){
        checkIntegrity();
        T result = null;
        if(numberOfEntries > 0){
            result = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    } 
    
    //The getTopBook method should retrieve this pile's top book.
    @Override
    public T getTopBook(){
        checkIntegrity();
        if (numberOfEntries == 0) {
            return null;
        } else {
            return bag[numberOfEntries -1];
        }
    }
    
    /** Sees whether this bag is empty.
     * @return  True if the bag is empty, or false if not. */
    @Override
    public boolean isEmpty(){
        return numberOfEntries == 0;
    }
    
    @Override
    /** Removes all entries from this bag. */
    public void clear(){
        while (!isEmpty()){
            remove();
        }
    };
    
}