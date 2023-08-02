package comparing;
import java.util.*;

import java.util.ArrayList;

public class Listcomparestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<>();
		list.add("Hello");
		list.add("to");
		list.add("Queues");
		list.add("dear");
		list.add("Ashitha");
		
		Comparator<String> com= new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
			if(o1.length()>o2.length())
				return 1;
			else
				return -1;
				
				
			}
		};
		
		
		
		Collections.sort(list, com);
		System.out.println(list);

	}
	
	

}
