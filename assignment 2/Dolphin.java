/**
 * Dolphin make randome move and display name.
 *
 * Dolphin has one default constructor that intialize the count,
 * and move,two implement the getChar() method display specific 
 * character for the animal and the getMove() move in specific way
 * that implement from ocean class.
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 2
 * @due 02/20/2020
 */


import java.util.Random;


public class Dolphin implements Ocean{
    int count;
    int move;
    
    public Dolphin(){
        count = 0;
        move = 0;
    }
    
    /**
     * display the creature name.
     * 
     * @pre must be a character
     * @post must be a character
     * @return a character represent the creature.
     */
    public char getChar() {
        return 'D';	
    }
    
    /**
     * the direction creature will move.
     *  
     * @pre must be a integer.
     * @post must be a integer.
     * @return the direction creature will move.
     */
    public int getMove(OceanInfo infor) {
    	Random rand = new Random();
    	int randomNumber = rand.nextInt(5); // 0-4
        int[] direction = {Ocean.NORTH,Ocean.SOUTH, Ocean.EAST,
                           Ocean.WEST, Ocean.CENTER };
        if(count % 3 == 0) {
            move = direction[randomNumber];
        }
        count++;
        return move;
    }
}
