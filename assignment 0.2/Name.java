/**
 * Represent a name of a person
 *
 * Name has fields and accessor methods
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 0.2
 * @due 02/06/2020
 */		


public class Name {
    private String firstName;
    private char middleInitial;
    private String lastName;
	
/** 
 * Name constructor create name.
 * 
 * Name constructor create a person with specific name
 * 
 * @pre must be String, char.
 * @post must be String, char.
 * @param newFirst Represent the person's first name.
 * @param newMiddle Represent the person's middle name.
 * @param newLast Represent the person's last name.
 */
    public Name(String newFirst, char newMiddle, String newLast) {
	firstName = newFirst;
	middleInitial = newMiddle;
	lastName = newLast;
    }
	
/** 
 * Gets the person's first name.
 * 
 * Get person's first name with specific first name passing in to constructor.
 *  
 * @return A string representing the person's name
 * name.
 */
    public String getFirstName() {
	return this.firstName;
    }
	
/** 
 * Gets the person's middle name.
 * 
 * Gets the person's middle name with specific middle name passing in to constructor.
 * 
 * @return A char representing the person's middle name
 * name.
 */
    public char getMiddleInitial() {
        return this.middleInitial;
    }
	
/** 
 * Gets the person's last name.
 * 
 * Gets the person's last name with specific last name passing in to constructor.
 * 
 * @return A string representing the person's last name
 * name.
 */
    public String getLastName() {
        return this.lastName;
    }
 }
