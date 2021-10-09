/**
 * Flounder make randome move and display name.
 *
 * Flounder has one default constructor that intialize the count,
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
 
 
public class Flounder implements Ocean {
    int count;
    int move;
    int index;
    
     
    /**
     * default constructor that initialize the move count
     * and index
     */
    public Flounder(){
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
        return 'F';
    }
    
    /**
     * the direction creature will move.
     *  
     * @pre must be a integer.
     * @post must be a integer.
     * @return the direction creature will move.
     */
    public int getMove(OceanInfo info) {
        int[] direction = {Ocean.WEST,Ocean.CENTER,Ocean.NORTH,Ocean.CENTER};
        move = direction[count % 4];
        count++;
        return move;
    }
}

