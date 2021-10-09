/**
 * Test client class for Name class
 *
 * NameClin has only main method to call the Name class.
 * 
 * 
 *
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 0.2
 * @due 02/06/2020
 */		


public class NameClient {
        public static void main(String[] args) {
            Name n1 = new Name("John", 'Q', "Public"); 
	    System.out.println(n1.getFirstName());
	    System.out.println(n1.getMiddleInitial());
	    System.out.println(n1.getLastName());
	}
 }
