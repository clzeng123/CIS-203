/**
 * Test clients for Date class.
 *
 * DateClient only have main method to call the Date class method.
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 0.2
 * @due 02/06/2020
 */ 


public class DateClient {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a);
        Date b = new Date(2006,12,4);
        System.out.println(b);
        b.setDate(2005,3,10);
        System.out.println(b);
        Date c = new Date(2008,12,4);
        c.addDays(10);
        System.out.println(c);
        Date d = new Date(2007,1,1);
        d.addWeek(1);
        System.out.println(d);
    }
 }
