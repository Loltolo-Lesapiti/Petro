/**
 * @author : Kenneth Mensah on 9/8/16.
 * This class models a Counter
 *
 */
public class Counter {
    
    private int currentValue; //instance variable to represent the current value of the counter
    private int limit;        //instance variable to represent the limit of the counter
    
    
    /**
     * Constructor that takes in a parameter that represents the limit of the Counter
     * @param limit: parameter that hold the value for the limit of the Counter
     */
    public Counter(int limit){
        this.limit = limit;
        this.currentValue = 0;
    }
    
    
    /**
     * Mutator method that sets the current value of a counter
     * The current value is actually set to currentValue % limit to mitigate
     * against trying to set the current value to a value greater than limit.
     * @param currentValue: parameter that sets the value of the current value
     */
    public void setCurrentValue(int currentValue){
        this.currentValue = currentValue % limit;        
    }
    
    /**
     * Mutator method that sets the limit of the Counter
     * @param limit: : parameter that hold the value for the limit of the Counter
     */
    public void setLimit(int limit){
        this.limit = limit;
    }
    
    /**
     * Accessor method that gets the currentValue variable
     * @return : int
     */
    public int getCurrentValue(){
        return currentValue;
    }
    
    /**
     * Accessor method that gets the limit of the counter
     * @return : int
     */
    public int getLimit(){
        return limit;
    }
    
    /**
     * A method that increments the current value of the counter and wraps 
     * around when necessary.  The method returns the new value of the counter
     * @return : int
     */
    public int incrementCounter(){
        currentValue++;
        currentValue %= limit; // same as currentValue = currentValue % limit
        return currentValue ;
    }
    
    /**
     * A method that decrements the value of the counter and wraps around when
     * necessary.  The method returns the new value of the counter.
     * @return : int
     */
    public int decrementCounter(){
        currentValue--;
        
        // wrap around if currentValue becomes negative
        if (currentValue < 0)
            currentValue = (currentValue + limit) % limit;
        
        return currentValue;
    }
    
    
    /**
     * A method that resets the current value to 0
     */
    public void reset(){
        currentValue = 0;
    }
    
    /**
     * A method that compares the current value and limit of one counter with
     * those of another counter
     * @param otherCounter: Counter object that is compared to currently referenced Counter object
     * @return : boolean
     */
    public boolean equals(Counter otherCounter){
        return ( this.getCurrentValue() == otherCounter.getCurrentValue()
                    && this.getLimit() == otherCounter.getLimit());
    }
}
