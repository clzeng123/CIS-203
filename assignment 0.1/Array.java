/**
 * Array use to test different types of conditions for arrays.
 *
 * Array has all static methods to find the whatever value in array
 * is duplicate, determine the biggest value in array, calculate the
 * mean in array, report the array in reverse determine two array that
 * first element in first array is less than as the element
 * in second array
 *
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 0.1
 * @due 02/04/2020
 */


import java.util.Arrays;


public class Array {
    public static void main(String[] args) {
        int[] data = {27, 51, 33, -1, 101};
        check();
        int[] numbers = {12, 7, -1, 25, 3, 9};
        System.out.println("max value is " + max(numbers) + "\n");
        int[] values = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println("average is " + average(values));
        int[] element = {1, -3, 4, 7, 2};
        printBackwards(element);
        System.out.println();
        int[] number = {45, 20,300,};
        int[] value = {50, 41, 600,};
        System.out.println(allLess(number, value));
        System.out.println();
        String[] word = {"alpha", "beta", "gamma", "delta", "gamma", "beta",
        "alpha"};
        System.out.println(isPalindrome(word));
    }
    
/**
 * check whatever the two array have same elements.
 *
 * check whatever the two array have same elements, by compare the
 * each element.
 *
 * @pre: both array not empty
 * @post: return whatever two arrays both have the same elements.
 */
    public static void check () {
        int[] first = new int[2];
        first[0] = 3;
        first[1] = 7;
        int[] second = new int[2];
        second[0] = 3;
        second[1] = 7;
        System.out.println("first = " + Arrays.toString(first) + "");
        System.out.println("second = " + Arrays.toString(second) + "");
        if (Arrays.equals(first,second)) {
            System.out.println("They contain the same elements.\n");
        }else { // two array does not equal to each other
            System.out.println("The elements are different.\n");
        }
    }
    
/**
 * determine the biggest value in array.
 *
 * determine the biggest value in array, by comare each element
 * in the array.
 *
 * @pre not an empty array.
 * @post an array of numbers.
 * @param passing the array with value.
 * @return the biggest value in the array.
 */
    public static int max(int[] numbers) {
        int max = 0;
        for (int i = 0 ; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    
/**
 * calculate mean of the array being passed in.
 *
 * calculate mean by passing an array with number in it, it 
 * go through the array the element then adding together then divide by
 * array's length to get average
 *
 * @pre not an empty array.
 * @post an array of numbers.
 * @param passing the array with value.
 * @return the mean of the array being passed in.
 */
    public static double average(int[]values) {
        int average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        return (double)average / values.length;
    }

/**
 * print out the array with index in reverse order.
 *
 * print out the array with reverse order with index number
 * and corresponding element.
 *
 * @pre not an empty array.
 * @post an array of numbers.
 * @param passing the array with value.
 * @return the array with word element with index number and corresponding
 * elements.
 */
    public static void printBackwards(int[] element) {
        for (int i = element.length-1; i >= 0; i--) {
            System.out.println("element " + "[" + i + "]" + " is " 
            + element[i]);
        }
    }
    
/**
 * Report back whatever the array is less than each other in the same
 * index.
 *
 * Report back whatever the array is less than each other in same index
 * of corresponding element.
 *
 * @pre not an empty array.
 * @post an array of numbers;
 * @param passing two arrays with value.
 * @return true or false whatever each element in the first array is
 * less than the element at the same index in the second array.
 */
    public static boolean allLess(int[] number, int[] value) {
        if (number.length == value.length && number[0] < value[0]
        && number[1] < value[1] && number[2] < value[2]){
            return true;
        }
        return false;
    }

/**
 * Check the array to see if it was read same from forward and backward.
 *
 * Check whatever the array is read same from forward and backward
 * print out the array with reverse order with index number and
 * corresponding element.
 *
 * @pre not an empty array.
 * @post array of strings.
 * @param passing the array with elements.
 * @return true if that array reads the same forwards as backwards
 * and /false if not.
 */
    public static boolean isPalindrome(String[] word) {
        for (int i = 0; i < word.length/3; i++) {
            if (!word[i].equals(word[word.length-1-i])){
                return false;
            }   
        }
        return true;
    }
}
