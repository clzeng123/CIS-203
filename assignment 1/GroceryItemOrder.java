/**
 * GroceryItemOrder represent  an item to buy
 *
 * GroceryItemOrder has constructor, accessor, mutator 
 * and toString method to let user know what item 
 * have buy,amount and the unit price, also the
 * total price.
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 1
 * @due 02/13/2020
 */


public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double unitPrice;

/**
 * Create an order.
 * 
 * Create an order with specific name, quantity and price.
 * 
 * @pre  newName = null,newQuantity>= 0, newUnitPrice>=0.0
 * @post newName = null,newQuantity>= 0, newUnitPrice>=0.0
 * @param newName create name for the item.
 * @param newQuantity create amount for the item.
 * @param newUnitPrice create price for the item.
 */
    public GroceryItemOrder(String newName, int newQuantity, double newUnitPrice) {
        this.name = newName;
        this.quantity = newQuantity;
        this.unitPrice = newUnitPrice;
    }
    
/**
 * Create a specific name for the item.
 *
 * @pre newName as a string.
 * @param newName create name for the item
 */
    public GroceryItemOrder(String newName) {
	this(newName,0,0.0);
    }

/**
 * Get the cost of the items
 * 
 * @return the cost of the items.
 */
    public double getCost() {
        return this.quantity * this.unitPrice;
    }

/**
 * set the quantity of the items
 * 
 * @pre newQuantity >= 0.
 * @post newQuantity >= 0.
 * @param newQuantity must be int.
 */
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

/**
 * set the price for the items
 * 
 * @pre newUnitPrice >= 0.0;
 * @post newUnitPrice >= 0.0;
 * @param newUnitPrice must be double
 */
    public void  setUnitPrice(double newUnitPrice) {
        this.unitPrice = newUnitPrice;
    }

/** 
 * report the state of filed: name, quality and unitprice.
 *
 * @return all the fields state.
 */
    public String toString() {
        return this.name + ": " + this.quantity + " @ $" + this.unitPrice;  
    }
}
