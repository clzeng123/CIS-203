/**
 * Reverser take in text file and reverse in the line order,
 * the words within each line, or a complete reversal. 
 *
 * Reverser has default constructor and reverseLines which use to 
 * reverse the line order, reverseEachLines which use to  the
 * reverse the words within each line,complete reversal reverse
 * the word in each line and the line order as well.
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 3
 * @due 02/27/2020
 */


import java.io.File; // for file
import java.io.FileNotFoundException; // for file no found exception
import java.io.PrintStream; // for print stream
import java.util.ArrayList;// for arraylist
import java.util.Scanner;// for scanner  


public class Reverser {
    private ArrayList<String> list;
    private String fileName;
    private Scanner fileScan;
    private String array[];
	
	/**
	 * create a file object and scan the file
	 * add to array list.
	 * 
	 * @param newFile pass in a file object.
	 * @throws FileNotFoundException if file dont exist.
	 */
	public Reverser(File newFile) 		
	  throws FileNotFoundException {
          list = new ArrayList<String>();
	  fileScan = new Scanner(newFile);
	  while (fileScan.hasNextLine()) {
	       list.add(fileScan.nextLine());			
	  }
	}
	
	/**
	 * reverseLines take in a file and reverse the line order.
	 * 
	 * @pre must be a file.
	 * @post must be a file.
	 * @param outPutFile passing a file object
	 * @throws FileNotFoundException if file dont exist.
	 */
	public void reverseLines(File outPutFile)
          throws FileNotFoundException { 
          PrintStream ps = new PrintStream(outPutFile);
	  for (int i = list.size()-1; i >= 0; i--) {
	      ps.println(list.get(i));
	  }
	}
	
       /** 
        * @pre must be a file.
        * @post must be a file.
        * @throws FileNotFoundException if file dont exist. 
        */
	public void reverseEachLines(File newOutPutFile) 
	  throws FileNotFoundException {
          PrintStream ps = new PrintStream(newOutPutFile);
	  for (int i = 0; i < list.size()-1 ; i++) {
             array = list.get(i).split(" ");
             for(int j = array.length-1; j >=0; j--) {
                 ps.print(array[j] + " "); 
             }
          ps.println();
          }
        }
	
       /**
        * completeReverse reverse the wordin each line and reverse the line order
        * as well
        * 
        * @pre must be a file.
        * @post must be a file.
        * @throws FileNotFoundException if file dont exist. 
        */
        public void completeReverse(File newOutPutFiles) 
          throws FileNotFoundException {
          PrintStream ps = new PrintStream(newOutPutFiles);
          for (int i = list.size()-1; i >= 0; i--) {
              array = list.get(i).split(" ");
              for (int j = array.length-1; j >=0; j--) {
                  ps.print(array[j] + " ");  
              }
              ps.println();
          }
    }
}
