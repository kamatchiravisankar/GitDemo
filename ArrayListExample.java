package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(98);
		ls.add(12);
		ls.add(981);
		ls.add(31);
		ls.add(928);
		ls.add(13);
		ls.add(958);
		ls.add(0,0);
		ls.remove(4);
		//ls.removeAll(ls);
		System.out.println(ls.get(0));
		System.out.println(ls.contains(13));
		System.out.println(ls.indexOf(31));
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		
		
		System.out.println(ls);
		Iterator it=ls.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
	}
}
