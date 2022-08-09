package generics;
import java.util.*;
public class Generics2 {

	public static void main(String[] args) 
	{
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
	}

}
