/**
 * Linklist contain the  basic functions of a linked list.
 *
 * Linklist has a deafult constructor, add method add the element to end of list, 
 * add method add element to the given index in the list, size method
 * return the number of element in the list, 
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 4
 * @due 03/5/2020
 */


import java.util.NoSuchElementException;


public class LinkList {
    private ListNode front;
	
    /**
     * initialize field front to null;
     */
    public LinkList() {
        front = null;
    }
	
     /**
      * Appends the given value to the end of the list.
      * 
      * pre data >= 0.
      * post data >= 0.
      * @param data must be a integer.
      */
    public void add(int data) {
        if(front == null) {
            front = new ListNode(data);
        }else {
            ListNode current = front;
	    while(current.next != null) {
                current = current.next;
	    }
	    current.next = new ListNode(data);
        }
    }
	
    /**
     * Inserts the given value at the given index (position) in the list. 
     * 
     * @pro value >= 0;
     * @post value >= 0;
     * @param index must be a integer.
     * @param value must be a integer.
     */
    public void add(int index, int value) {
        if(index == 0) {
            front = new ListNode(value);
        }
        ListNode current = front;
	for(int i = 0; i < index-1; i++) {
	    current = current.next;
	}
	current.next = new ListNode(value,current.next);
    }
	
    /**
     * Returns the current number of elements in the list. 
     * 
     * @return the current number of elements in the list. 
     */
    public int size() {
        int size = 0;
	if(front == null) {
	    return 0;
        }else {
	    ListNode current = front;
	    while(current != null) {
	    current = current.next;
	    size++;
	    }
	}
	return size;
    }
	
    /**
     * whatever list is empty or not.
     * 
     * @return a true or false indicate list is empty or not.
     */
    public boolean isEmpty() {
        return front == null;
    }
	
    /**
     * Returns the data at the given index (position) in the list. 
     * 
     * @pro 0 <= index 
     * @post 0 <= index
     * @param index must be a integer
     * @return the data at the given index (position) in the list. 
     * @throws throws NoSuchElementException when list is empty
     * try to get value.
     */
    public int get(int index)
        throws NoSuchElementException{
        if(front == null) {
            throw new NoSuchElementException();
        }else {
            ListNode current = front;
            for (int i = 0; i < index; i++) {
            	current = current.next;
            }
        return current.data;
        }
    }
	
    /**
     * Removes the value at the given index (position). 
     * 
     * @pro index >= 0.
     * @post index >=0
     * @param index position in the list
     * @throws throws NoSuchElementException when list is empty.
     */
    public void remove(int index) 
        throws NoSuchElementException{
        if(front == null) {
            throw new NoSuchElementException();
        }else if (index == 0) {
            front = front.next;
        } else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }
	
    /**
     *  return a bracket version list with comma-separated.
     */
    public String toString() {
        if(front == null) {
            return "[]";
        }else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while(current != null) {
                result += "," + current.data;
                current = current.next;
            }
          result += "]";
          return result;
        }
    }
}
