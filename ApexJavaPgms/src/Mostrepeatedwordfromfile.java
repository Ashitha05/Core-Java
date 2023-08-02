import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mostrepeatedwordfromfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filePath = "/Users/tcs/Documents/Word.txt";
		try { 
		 File file = new File(filePath);
         Scanner scanner = new Scanner(file);
         String most="";
         
         HashMap<String,Integer> map= new HashMap<String,Integer>();
         
         while (scanner.hasNext()) {
             String word = scanner.next();
             if(map.containsKey(word))
 			{
 				Integer j=map.get(word);
 				map.replace(word, j+1);
 			}
 			else
 				map.put(word, 1);
		}
         scanner.close();
         
         Integer highest=Integer.MIN_VALUE;
 		for (Map.Entry<String, Integer> entry : map.entrySet()) {
 			Integer current= entry.getValue();
 			
 			if(current>highest)
 			{
 				highest=current;
 				 most= entry.getKey();
 		}
 		
 		}
 		System.out.println("Most repeated word is: "+most);
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        }

	}

}
