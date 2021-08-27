//4. Write a Java program to empty an hash set.  
import java.util.*;
public class Hashset4{
	public static void main(String args[])
	{
	 HashSet<String>h_set=new HashSet<String>();
	h_set.add("black");
	h_set.add("white");
	h_set.add("pink");
	h_set.add("red");
	System.out.println("hashset is:"+h_set);
	h_set.removeAll(h_set);
	System.out.println("empty hashset is:"+h_set);
	}
}