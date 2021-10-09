/**
 * 
 * Figure print out the start with different level and spaces
 * 
 * Figure have main method and a figure method that take in level and spaces
 * as parameter to print out the figure with level and spaces.
 * 
 * @author Changli Zeng
 * @email zengc203@potsdam.edu 10 
 * @course CIS 203 Computer Science II 11 
 * @assignment 6
 * @due 04/2/2020
 *
 */
public class Figure {
    public static void main (String [] args) {
	figure(Integer.parseInt(args[0]), 0);
    } 
  
  /**
   * print out the figure with feed in level and space;
   *  
   * @pro level <= 0; space <= 0;
   * @post level <= 0; space <= 0.
   * @param level the number of level.
   * @param space the number of space.
   */
  public static void figure(int level, int space) {
      //base case 
      if(level == 0) {  
	   System.out.print("*");
      }else {
	  // prints out the top part
	  figure(level-1,space);
	  System.out.println();
	  for (int i = 0; i < space; i++) {
	      System.out.print(" ");
	  }
	  
	  // prints out the middle part
	  for(int i = 0; i < (int)Math.pow(2, level); i++) {
	      System.out.print("*");
	  }  
	  System.out.println();
	  // prints out the bottom part
	  for (int i = 0; i < space + (int)Math.pow(2, level-1); i++) {
	      System.out.print(" ");
	  }
	  figure(level-1,space + (int)Math.pow(2, level-1));
      } 
  }
}


