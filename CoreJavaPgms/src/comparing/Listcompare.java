package comparing;
import java.util.*;

public class Listcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= new ArrayList<>();
		l1.add(21);
		l1.add(45);
		l1.add(36);
		l1.add(10);
		l1.add(5);
		
Comparator<Integer> comp= new Comparator<Integer>() {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
			return 1;
		else
			return -1;
	}
};



Collections.sort(l1, comp);
System.out.println(l1);
		

	}

}
