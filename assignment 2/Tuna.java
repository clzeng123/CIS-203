/**
 * Tuna make randome move and display name.
 *
 * Tuna has one default constructor that intialize the count,
 * and move,two implement the getChar() method display specific 
 * character for the animal and the getMove() move in specific way
 * that implement from ocean class.
 * 
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 2
 * @due 02/20/2020
 */
 
 
public class Tuna implements Ocean{
    int move;
    int count;
    int index;
    
    /**
     * default constructor that initialize the move count
     * and index
     */
    public Tuna(){
        move = 0;
        count = 0;
        index = 0;
    }
    
     /**
     * display the creature name.
     * 
     * @pre must be a character
     * @post must be a character
     * @return a character represent the creature.
     */
    public char getChar() {
    	return 'T';
    }
    
    /**
     * the direction creature will move.
     *  
     * @pre must be a integer.
     * @post must be a integer.
     * @return the direction creature will move.
     */
    public int getMove(OceanInfo info) {
        int[] direction = {Ocean.SOUTH,Ocean.WEST,Ocean.NORTH,Ocean.EAST};
        if(count % 4 == 0){
            move = direction[index % 4];
            index++;
        
        }
        count++;
        return move;
    }
}    
