import java.util.*; 

public class TestGroceryList {
	 public static void main (String [] args) {     
		 GroceryList list = new GroceryList();        
		 // The empty grocery list must print out as a blank       
		 // and its total cost must be $0        
		 System.out.println("Grocery List:");        
		 System.out.println(list);                
         System.out.printf("Total Cost: $%.2f\n", list.getTotalCost()); 
		 System.out.println();

         // fill the list with items, 10 items         
		 fillList(list,10); 
         // This next item should not be added         
		 list.add(new GroceryItemOrder("celery", 2, 1.67));      
		 System.out.println("Grocery List:");         
		 System.out.print(list);
		 System.out.printf("Total Cost: $%.2f\n",list.getTotalCost());     
		 System.out.println(); 
		 // make a new list that is not "full"   
		 
		 list = new GroceryList();        
		 fillList(list, new Random().nextInt(7)+1);   
		 System.out.println("Grocery List:");         
		 System.out.print(list);         
		 // just the items should print, no NULLs!  
		 System.out.printf("Total Cost: $%.2f\n",list.getTotalCost());        
		 System.out.println();     
	 } 
		 
	// method fillList -- helper method to populate GroceryList   
	//       member array    
	// Parameters: list -- the current list to populate   
	//     numItems -- number of items to create, given    
	//       by user    
	// Precondition: GroceryList object list exists   
	// Postcondition: list is populated with numItems GroceryItemOrder     
	//    objects    
	 public static void fillList(GroceryList list, int numItems) {   
		 Random rand = new Random();        
		 for (int i = 0; i < numItems; i++) {   
			 GroceryItemOrder g = new GroceryItemOrder("g" + (i+1));        
			 g.setQuantity(rand.nextInt(5) + 1);          
			 double unitPrice = rand.nextDouble() * 1000;       
			 unitPrice =  (int) unitPrice / 100.0;         
			 g.setUnitPrice(unitPrice);           
			 list.add(g);     
			 }  
        
	 }	 
 }
