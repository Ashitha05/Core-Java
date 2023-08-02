import java.util.HashMap;
import java.util.Map;
public class Mostrepeatedword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello world this is a new world";
System.out.println(repeatedword(str));
	}
	public static String repeatedword(String str)
	{
		String word="";
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		String[] s= str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(map.containsKey(s[i]))
			{
				Integer j=map.get(s[i]);
				map.replace(s[i], j+1);
			}
			else
				map.put(s[i], 1);
		}
		
		Integer highest=Integer.MIN_VALUE;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			Integer current= entry.getValue();
			
			if(current>highest)
			{
				highest=current;
				 word= entry.getKey();
		}
		
		}
		return word;
		
	}

}
