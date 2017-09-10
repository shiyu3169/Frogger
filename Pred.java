// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

// Represents an interface of predicates
public interface Pred<T> {
    /*TEMPLATE
     * Fields:
     * None
     * 
     * Methods:
     * question(T, int, int)......   --boolean
     * 
     * Methods for fields:
     * None
     * 
     */
    

    // ask the question associated to this predicate
    public boolean question(T item, int width, int height);
}
