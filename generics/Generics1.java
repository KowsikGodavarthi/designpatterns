package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 
{
	public static boolean Addition(List<Integer> list)
	{
		return list.addAll(list);
	}
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.print(Addition(list));
	}

}
