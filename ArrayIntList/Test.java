public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
	ArrayList a = new ArrayList();
	//System.out.println("list is " + a);
	//System.out.println(a.size());
	String[] list1 = {"a","b","c","d","e","f","g","h","i","j", "k", "l","m"};
	for(String n1:list1) {
	    a.add(n1);
	}
	System.out.println("list 1=" + a);
	String[] list2 = {"A", "B", "C", "D", "E"};
	ArrayList b = new ArrayList();
	for(String n2:list2) {
	    b.add(n2);
	}
	System.out.println("list 2=" + b);
	System.out.println();
	System.out.println("Test addAll");
	a.addAll(4, b);
	System.out.println("list 1 after addAll=" + a);
	System.out.println();
	
	System.out.println("Test equal");
	String[] list3 = {"A", "B", "C", "D", "E"};
	ArrayList c = new ArrayList();
	for(String n3:list3) {
	    c.add(n3);
	} 
	System.out.println(b);
	System.out.println(c);
	//System.out.println(a.equals(b));
	System.out.println(b.equals(c));
	System.out.println();
	System.out.println("lastIndexOf");
	String[] list4 = {"A", "4", "C", "4", "A"};
	ArrayList d = new ArrayList();
	for(String n4:list4) {
	    d.add(n4);
	} 
	System.out.println(d.lastIndexOf("4"));
	System.out.println();
	
	System.out.println(d.remove("4"));
	System.out.println(d);
	
	d.removeRange(0, 2);
	System.out.println(d);
	//System.out.println(d.sublist(0, 4));
    }
}
