/**
 * @author Jak Ashuraliev
 * Data Structures / Algorithms
 * 
 * LinkedBag (A bag implementation that links data)
 */

public interface BagInterface<T> {
    
    public boolean add(T anEntry);
    
    public T remove();
    
    public boolean remove(T anEntry);
    
    public int getCurrentSize();
    
    public boolean isEmpty();
    
    public void clear();
    
    public int getFrequencyOf(T anEntry);
    
    public boolean contains(T anEntry);
    
    public T[] toArray();
    
    public void replace(T anEntry);
    
    public void removeEvery(T anEntry);
}
