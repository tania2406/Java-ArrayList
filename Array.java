package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//public class ex1 {
//
//	public static void main(String args[])
//
//{
//		ArrayList<Integer> a=new ArrayList<Integer> ();
//		
//a.add(90);
//a.add(32);
//a.add(45);
//a.add(67);
//a.add(99);
//a.add(21);
//a.add(44);
//a.add(90);
//System.out.println(a);
//for(int p:a)
//{
//	System.out.println(p);
//}
//List<String> city=Arrays.asList("Ranchi","patna","delhi","tata","London");
//System.out.println(city);
//for(String s:city)
//	System.out.println(s);
//}
//}

// some Operations on Array list:

public class Array {

	public static void main(String args[])

{
		ArrayList<Integer> a=new ArrayList<Integer> ();
		
a.add(90);
a.add(32);
a.add(45);
a.add(67);
a.add(99);
a.add(21);
a.add(44);
a.add(90);
System.out.println(a);
a.add(0,56);
System.out.println(a);
System.out.println(a.indexOf(90));
a.remove(1);
System.out.println(a);
System.out.println(a.size());
Collections.sort(a);
System.out.println(a);
Collections.reverse(a);
System.out.println(a);
System.out.println(Collections.min(a));
System.out.println(Collections.max(a));

//Collections.shuffle(a);
System.out.println(a);
//Collections.rotate(a,-3);
System.out.println(a);


int sum=0;
Iterator<Integer> i=a.iterator();
while(i.hasNext())
{
	sum+=i.next();
	
}
System.out.println("sum"+sum);
}

			
}
