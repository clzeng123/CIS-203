// Stuart Reges
// 1/26/00
// Revised 08/2019 L. Grabowski
//
// Class OceanModel keeps track of the state of the Ocean simulation.
/**
 * The update method is to derminte who get eat
 *
 * The update method is to derminte who get eate
 * which Shark eat everything, then Shark random get 
 * eat by other creature,other creature can be eat by other
 * 
 * @author Changli Zeng Student
 * @email zengc203@potsdam.edu
 * @course CIS 203 Computer Science II
 * @assignment 2
 * @due 02/20/2020
 */
 
 
import java.util.*;
import java.awt.*;



public class OceanModel {
    private int myHeight;
    private int myWidth;
    private Ocean[][] myGrid;
    private char[][] display;
    private Map<Ocean, Point>myList;
    private SortedMap<String, Integer>OceanCount;

    public OceanModel(int width, int height) {
        myWidth = width;
        myHeight = height;
        myGrid = new Ocean[width][height];
        display = new char[width][height];
        updateDisplay();
        myList = new HashMap<Ocean, Point>();
        OceanCount = new TreeMap<String, Integer>();
    }

    public void add(int number, Class Ocean) {
        if (myList.size() + number > myWidth * myHeight)
            throw new RuntimeException("adding too many Oceans");
        for (int i = 0; i < number; i++) {
            Object instance;
            try {
                instance = Ocean.newInstance();
            } catch (Exception e) {
                throw new RuntimeException("no zero-argument constructor for "
                                           + Ocean);
            }
            if (!(instance instanceof Ocean)) {
                throw new RuntimeException(Ocean
                                           + " does not implement Ocean");
            }
            Ocean next = (Ocean)instance;
            int x, y;
            do {
                x = randomInt(0, myWidth - 1);
                y = randomInt(0, myHeight - 1);
            } while (myGrid[x][y] != null);
            myGrid[x][y] = next;
            display[x][y] = next.getChar();
            myList.put(next, new Point(x, y));
        }
        String name = Ocean.getName();
        if (!OceanCount.containsKey(name))
            OceanCount.put(name, number);
        else
            OceanCount.put(name, OceanCount.get(name) + number);
    }

    private static int randomInt(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    public int getWidth() {
        return myWidth;
    }

    public int getHeight() {
        return myHeight;
    }

    public char getChar(int x, int y) {
        return display[x][y];
    }

    // We want to ask each Ocean once on each round how to display it.
    // This method does the asking, storing the result in display.
    private void updateDisplay() {
        // set it to all dots
        for (int x = 0; x < myWidth; x++) 
            for (int y = 0; y < myHeight; y++)
                if (myGrid[x][y] == null)
                    display[x][y] = '.';
                else
                    display[x][y] = myGrid[x][y].getChar();
    }

    /**
     * Shark eat almost everything, but Shark radome get eat.
     *
     */
    public void update() {
        /*Ocean[][] newGrid = new Ocean[myWidth][myHeight];
        Object[] list = myList.keySet().toArray();
        Collections.shuffle(Arrays.asList(list)); */
        /* **********************************************************
           For Task 2, write your new collision rules in this for loop.
           You don't need to change the first 4 lines at all.
           Take some time to figure out what it happening in the
           existing if statement. You may be able to use the code in
           your updated rules.
        ********************************************************** */
       /* for (int i = 0; i < list.length; i++) {
            Ocean next = (Ocean) list[i];
            Point p = myList.get(next);
            int move = next.getMove(new Info(p.x, p.y));
            movePoint(p, move);
            if (newGrid[p.x][p.y] != null) {
                String c = newGrid[p.x][p.y].getClass().getName();
                OceanCount.put(c, OceanCount.get(c) - 1);
                myList.remove(newGrid[p.x][p.y]);
            }
            newGrid[p.x][p.y] = next;
        }
        myGrid = newGrid;
        updateDisplay(); */
        Ocean[][] newGrid = new Ocean[myWidth][myHeight];
        Object[] list = myList.keySet().toArray();
        Collections.shuffle(Arrays.asList(list));
        for (int i = 0; i < list.length; i++) {
            Ocean next = (Ocean) list[i];
            Point p = myList.get(next);
            int move = next.getMove(new Info(p.x, p.y));
            movePoint(p, move);
            if (newGrid[p.x][p.y] != null) {
                String c = newGrid[p.x][p.y].getClass().getName();
                if(c.equals("Shark")){
                    OceanCount.put(c, OceanCount.get(c) - 1);
                    myList.remove(newGrid[p.x][p.y]);
                }else{
                    OceanCount.put(c, OceanCount.get(c) - 1);
                    myList.remove(newGrid[p.x][p.y]);
                }
            }
            newGrid[p.x][p.y] = next;
        }
        myGrid = newGrid;
        updateDisplay();
    }

    public Set<Map.Entry<String, Integer>> getCounts() {
        return Collections.unmodifiableSet(OceanCount.entrySet());
    }

    // translates a point's coordinates 1 unit in a particular direction
    private void movePoint(Point p, int direction) {
        if (direction == Ocean.NORTH)
            p.y = (p.y + myHeight - 1) % myHeight;
        else if (direction == Ocean.SOUTH)
            p.y = (p.y + 1) % myHeight;
        else if (direction == Ocean.EAST)
            p.x = (p.x + 1) % myWidth;
        else if (direction == Ocean.WEST)
            p.x = (p.x + myWidth - 1) % myWidth;
        else if (direction != Ocean.CENTER)
            throw new RuntimeException("Illegal direction");
    }

    // an object used to query a Ocean's state (position, neighbors)
    private class Info implements OceanInfo {
        private int x;
        private int y;

        public Info(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public char getNeighbor(int direction) {
            Point other = new Point(x, y);
            movePoint(other, direction);
            return display[other.x][other.y];
        }

        public int getHeight() {
            return myHeight;
        }

        public int getWidth() {
            return myWidth;
        }
    }
}
