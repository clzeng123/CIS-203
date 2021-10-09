/**
 * Fractal take input as parameter print the figure
 * 
 * Fractal print ASCII Fractal that is put into a 
 * toString to be print out when it
 * is called in a client.
 * 
 * @author Changli Zeng
 * @email zengc203@potsdam.edu 10 
 * @course CIS 203 Computer Science II 11 
 * @assignment 6
 * @due 04/2/2020
 */


public class Fractal {
  private int level;
  private int space;
  static String result = "";
  /**
   * this is the default constructor 
   * 
   * intitalize the level to the pass in parameter
   * call call recursive figure method
   * @param myLevel number of level.
   */
  public Fractal(int myLevel) {
      level = myLevel;
      figure(level);
  }
  
  /**
   * call recursive figure method.
   * 
   * wrapper method call recursive figure method.
   * 
   * @pro level <= 0;
   * @param level
   */
  public static void figure(int level) {
      figure(level,0);
  }
  
  /**
   * the recursive figure method.
   * 
   * method call recursive figure method.
   * 
   * @pro level <= 0; space <= 0;
   * @post level <= 0; space <= 0.
   * @param level the number of level.
   * @param space the number of space.
   */
  private static void figure(int level, int space) {
    if(level == 0) {  
	result+="*";
    }else {
	// prints out the top part
	figure(level-1,space);
	result+= "\n";
	for (int i = 0; i < space; i++) {
	    result+=" ";
	}
	  
	// prints out the middle part
	for(int i = 0; i < (int)Math.pow(2, level); i++) {
	    result+="*";
	}  
	result+= "\n";
	// prints out the bottom part
	for (int i = 0; i < space + (int)Math.pow(2, level-1); i++) {
	    result+=" ";
    	}
	figure(level-1,space + (int)Math.pow(2, level-1));
     }
  }
  
  /**
   * print out the result of the fractal.
   */
  public String toString() {
    return result;
  }
}

