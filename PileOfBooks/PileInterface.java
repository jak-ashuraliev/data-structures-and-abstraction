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
 * @param <T>
 */

public interface PileInterface<T> {
    
    //The add method should add a new book to the top of this pile.
    public boolean add(T newEntry);

    //The remove method should remove and return this pile's top book.
    public T remove();

    //The getTopBook method should retrieve this pile's top book.
    public T getTopBook();

    //The isEmpty method should detect whether this pile is empty.
    public boolean isEmpty();

    //The clear method should remove all books from this pile.
    public void clear();
 
    
}
