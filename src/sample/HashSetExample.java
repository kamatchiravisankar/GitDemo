package sample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("JAVA");
		hs.add("CS");
		hs.add("ICECREAM");
		hs.add("CS");
		hs.add("JAVA");
		hs.add("CS");
		hs.add("ICECREAM");
		hs.add("CS");
		hs.add("JAVA");
		hs.add("CS");
		hs.add("ICECREAM");
		hs.add("CS");
		hs.add("JAVA");
		hs.add("CS");
		hs.add("ICECREAM");
		hs.add("CS");
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.remove("ICECREAM"));
		System.out.println(hs);
		System.out.println(hs.size()); 
		System.out.println(hs.contains("CS"));
		System.out.println(hs.removeAll(hs));
		System.out.println(hs.isEmpty());
		hs.add("JAVA");
		hs.add("CS");
		hs.add("ICECREAM");
		hs.add("CS");
		hs.add("JAVA");
		hs.add("CS");
		hs.add("ICECREAM");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
		
		
		
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
