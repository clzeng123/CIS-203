/**
 * TestLinkList is client for test linklist.
 *
 * TestLinkList only have main method use to test linklist.
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 4
 * @due 03/5/2020
 */


public class TestLinkList {
	public static void main(String[] args) {
            LinkList list  = new LinkList();
	    System.out.println("Test size");
	    System.out.println(list.size() + "\n");
		
	    System.out.println("Test Empty");
	    System.out.println(list.isEmpty() + "\n");
		
	    //System.out.println("Test remove empty list");
	    //list.remove(1);
		
	    //System.out.println("Test get a element from empty list");
	    //list.get(0);
		
	    System.out.println("Test add");
	    list.add(1);
	    list.add(2);
	    list.add(3);
 	    list.add(4);
            System.out.println(list);
	    System.out.println("Test Empty again");
	    System.out.println(list.isEmpty() + "\n");
	    System.out.println("Test size again");
	    System.out.println(list.size() + "\n");
		
            System.out.println("Test add methd in specific index, add 5 to");
            System.out.println("index 2.");
	    list.add(2,5);
	    System.out.println(list + "\n");
		
	    System.out.println("Test remove method");
	    list.remove(2);
	    System.out.println(list.size());
	    System.out.println(list + "\n");
		
            System.out.println("Test get method, get index 2");
	    System.out.println(list);
	    System.out.println(list.get(2));
	}
}
