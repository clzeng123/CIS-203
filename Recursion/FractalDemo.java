/**
 * client call fractal to run.
 * 
 * @author Changli Zeng
 * @email zengc203@potsdam.edu 10 
 * @course CIS 203 Computer Science II 11 
 * @assignment 6
 * @due 04/2/2020
 *
 */
public class FractalDemo {
    public static void main (String [] args) {
        Fractal f = new Fractal(Integer.parseInt(args[0]));
        System.out.print(f);
    }
}
