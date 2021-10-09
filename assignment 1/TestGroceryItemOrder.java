
public class TestGroceryItemOrder {
	public static void main (String[] args) { 
		GroceryItemOrder a = new GroceryItemOrder("celery", 2, 2.51); 
		GroceryItemOrder b = new GroceryItemOrder("dog food", 3, 32.54); 
		GroceryItemOrder c = new GroceryItemOrder("cookies"); 
		
		c.setQuantity(4);      
		c.setUnitPrice(2.33);
		System.out.println("Grocery List");   
		System.out.println(a);     
		System.out.println(b);    
		System.out.println(c);     
		System.out.printf("Total Cost: $%.2f\n",  
		(a.getCost() + b.getCost() + c.getCost()));   } 
	 
}

