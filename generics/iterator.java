package generics;
import java.util.*;
public class iterator 
{

	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<String>();
		l.add("Ram");
		l.add("raj");
		l.add("rocky");
		Iterator<String> itr =l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
