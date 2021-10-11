/**
 * BinSort sorts an array of integers based on each digit in each number.
 * 
 * BinSort has all static methods (and no constructor) including main.
 * constructBins construct the arraylist inside of an array.
 * readFile go through the file and stores dataset.
 * sort an array of integers based on each digit in each number
 * and store into the bin that inside array. finalResult empty
 * the array then store the value in bin to array, then remove the 
 * value from bin as well, also remove the 0 from array then going
 * back to the sort again repeatly.
 * 
 * @author Changli Zeng
 * @email zengc203@potsdam.edu 
 * @course CIS 203 Computer Science II 
 * @assignment 7
 * @due 04/16/2020
 */


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;


public class BinSort {
    @SuppressWarnings("unchecked")
    public static ArrayList<Integer> [] bin = (ArrayList<Integer>[]) new ArrayList[10];
    public static ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    public static int size;
    public static int max;
    public static int numberOfSort = 1;
    public static void main(String[] args) throws FileNotFoundException {
	constructBins();
	readFile(args[0]);
	System.out.println("Orinal array:" + intArrayList.toString());
	sort(intArrayList,bin);
    }
    
    /**
     * construct bins
     * 
     * construct arraylist inside array.
     */
    public static void constructBins() {
	for(int i = 0; i < bin.length; i ++) {
	    bin[i] = new ArrayList<>();
	}
    }
    
    /**
     * read file and store data.
     * 
     * pass in the file and read the date from the file
     * store first number is maximum number of digits 
     * the number of values in the data set
     * 
     * @pro must be exist file
     * @post must be exist file
     * @param file include data need to read.
     * @throws FileNotFoundException catch file not found error.
     */
    public static void readFile(String file) throws FileNotFoundException{
	Scanner fileScan = new Scanner(new File(file));
	max = fileScan.nextInt();
	size = fileScan.nextInt();
	int index = 0;
	while(fileScan.hasNextInt()) {
	    intArrayList.add(fileScan.nextInt()) ;
	    index++;
	}  
    }
  
    /**
     * modify the intArrayList.
     * 
     * empty the intArrayList, then store each value from
     * each bin and delete after stored to the arraylist,
     * then remove all the 0 from the list then printout 
     * the array.
     * 
     * @pro must pass in array. 
     * @post must pass in array. 
     * @param bins arraylist inside array
     */
    public static void finalResult(ArrayList<Integer>[] bins) {
	intArrayList.removeAll(intArrayList);
	for(int i = 0; i < bin.length; i++) {
	    for(int j = 0; j < bins[i].size();) {
		intArrayList.add(bins[i].get(j));
		bins[i].remove(bins[i].get(j));
	    }
	}
	
	for(int i = 0; i < size;i++) {
	    if(intArrayList.get(i) == 0) {
		intArrayList.remove(i);
	    }
	}
	System.out.print(numberOfSort + " time sort:");
	System.out.println(intArrayList.toString());
	numberOfSort++;
    }    
    
    /**
     * sort the list store to bin.
     * 
     * sort the array by isolate the digits
     * the digit going to be the index value 
     * in the arraylist. 
     * 
     * @pro must be arraylist and array.
     * @post must be arraylist and array.
     * @param list stores the data from the file
     * @param bins arraylist inside array
     */
    public static void sort(ArrayList<Integer>list, ArrayList<Integer>[] bins) {
	int diviser = 10;
	int powerOfTen = 10;
	int count = 1;
	for(int k = max; k > 0; k--) {
	    if(numberOfSort == 1) {
		max--;
		for(int i = 0; i < list.size(); i++) {
		    int lastDigit = list.get(i) % diviser;
		    bins[lastDigit].add(list.get(i));
		}
		finalResult(bins);
	    }else {
		max--;
		for(int i = 0; i < list.size(); i++) {
		    int lastDigit = (list.get(i)/powerOfTen) % diviser;
		    bins[lastDigit].add(list.get(i));
		}
		finalResult(bins);
		powerOfTen*=10; 
	    }
	}
    }
}
  
  	
 


