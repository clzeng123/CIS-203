/** 
 * ListNode is a class for storing a single node of a linked
 * list.
 * 
 * Listnode have defalute 
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 4
 * @due 03/5/2020
 */
public class ListNode {
    public int data;        
    public ListNode next;  

    /**
     *  constructs a node with data 0 and null link
     */
    public ListNode() {
        this(0, null);
    }
    
    /**
     * @pro data >= 0.
     * @post  data >= 0.
     * @param data  the integer value to be stored
     */
    public ListNode(int data) {
        this(data, null);
    }

    /**
     * constructs a node with given data and given link
     * 
     * @pro data >= 0  next should be link.
     * @post  data >= 0 next should be link.
     * @param data the integer value to be stored,
     * @param next the link to set next to
     */
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
