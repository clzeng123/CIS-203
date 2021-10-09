/**
 * The GroceryList represents a list of items to buy at the market.
 *
 * GroceryList has constructor, accessor, mutator and 
 * toString method to add the item to list, and calulate
 * the total cost, finally report back to the console.
 *
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 1
 * @due 02/13/2020
 */


public class GroceryList {
    private GroceryItemOrder[] items;
    private int size;
    
/**
 * create a GroceryList with specific capacity.
 */
    public GroceryList() {
        this.items= new GroceryItemOrder[10];
        this.size = 0;
    }

/**
 * add the item to the list, size increment.
 * 
 * add the item to the list, each time size increment.
 *
 * @pre most be a obejtct.
 * @param g the item of GroceryItemOrder.
 */
    public void add(GroceryItemOrder g) {
        if (this.size < 10){
            this.items[this.size] = g;
            this.size++;
        }
    }

/**
 * calculate the total cost of all items.
 *
 * @return the total cost of all items in the list.
 */
 
    public double getTotalCost() {
        int cost = 0;
        for (int i = 0; i < this.size; i++){
            cost += this.items[i].getCost();
        }
        return cost;
    }
    

/**
 * the list of item  with quantity and unit price of the GroceryList.
 *
 * @return the list of item  with quantity and unit price of the GroceryList.
 */	
    public String toString() {
        String result = "";
        for (int i = 0; i < this.size; i++){
            result += this.items[i] + "\n";
        }
        return result;
    }
}
