/**
 * Jellyfish make randome move and display name.
 *
 * Jellyfish has one default constructor that intialize the count,
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


public class Jellyfish implements Ocean {
    /**
     * display the creature name.
     * 
     * @pre must be a character
     * @post must be a character
     * @return a character represent the creature.
     */
    public char getChar() {
    	return 'J';
    }
    
    /**
     * the direction creature will move.
     *  
     * @pre must be a integer.
     * @post must be a integer.
     * @return the direction creature will move.
     */
    public int getMove(OceanInfo info) {
        int move = 0;
        Random rand = new Random();
        int randomNumber = rand.nextInt(4);
        if(randomNumber == 0) {
            move = Ocean.NORTH;
        }else if(randomNumber == 1){
            move = Ocean.SOUTH;
        }else if(randomNumber == 2) {
            move = Ocean.EAST;
        }else {
            move= Ocean.WEST;
        }
        return move;
    }
    
}
