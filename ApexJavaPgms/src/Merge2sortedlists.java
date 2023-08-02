import java.util.ArrayList;
import java.util.List;
public class Merge2sortedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> l1 = List.of(1, 3, 5, 7, 9);
	        List<Integer> l2 = List.of(1, 4, 7, 8, 10);
	        
	        System.out.println(mergetwolists(l1,l2));
	}
	
	public static List mergetwolists(List<Integer> l1, List<Integer> l2)
	{
		List<Integer> mergedList= new ArrayList();
		int i = 0; // Pointer for list1
        int j = 0; // Pointer for list2

        // Merge the two lists until one of them is exhausted
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                mergedList.add(l1.get(i));
                i++;
            } else {
                mergedList.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            mergedList.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            mergedList.add(l2.get(j));
            j++;
        }
        return mergedList;
	}

}
