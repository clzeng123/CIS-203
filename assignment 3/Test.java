/**
 * Test use to test the method in Reverser
 *
 * Test only got main method use to test 
 * the method in Reverser by calling the method.
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 3
 * @due 02/27/2020
 */
 
import java.io.File; // for file
import java.io.FileNotFoundException; // for file no found exception
public class Test {
	public static void main(String[] args) 
	  throws FileNotFoundException {
	  Reverser r = new Reverser(new File("test.txt")); 
	  r.reverseLines(new File("out1.txt"));  
          r.reverseEachLines(new File("out2.txt")); 
          r.completeReverse(new File("out3.txt"));
	}
}
