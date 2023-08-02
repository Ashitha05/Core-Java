import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.lang.*;
import java.util.*;
public class Stringactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="zbcdeabghabcb";
		
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		for(Character c: str.toCharArray())
		{
			
			if(map.containsKey(c))
			{
				Integer j=map.get(c);
				map.replace(c, j+1);
			}
			else
			{
				map.put(c, 1);
			}
			
			}
		int high=Integer.MIN_VALUE;
	for(	Map.Entry<Character, Integer> entry: map.entrySet())
	{
		
		
	
		if(entry.getValue()>high)
		{
			high=entry.getValue();
		
		}
		
		System.out.println(entry.getKey()+" is repeated "+ entry.getValue() +" times.");
		
	}
	Character cha= Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
	System.out.println("Most repeated character is "+ cha +" and is repeated "+ map.get(cha)+" times");
	
	List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
    
    


      // Sort the list
      Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
          public int compare(Map.Entry<Character, Integer> o1,
                             Map.Entry<Character, Integer> o2)
          {
              if(o1.getValue()<o2.getValue())
            	  return 1;
              else
            	  return -1;
          }
      });
       
      // put data from sorted list to hashmap
      HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
      for (Map.Entry<Character, Integer> aa : list) {
          temp.put(aa.getKey(), aa.getValue());
      }
      for (Map.Entry<Character, Integer> en : temp.entrySet()) {
          System.out.println("Key = " + en.getKey() +
                        ", Value = " + en.getValue());
      }
  }
	}
	


