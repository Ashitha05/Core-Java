
public class Xyzmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(xyzmid("xyzAxyzBBB")); 
	}
	public static boolean xyzmid(String str)
	{
		
		for(int i=0;i<str.length()-2;i++)
		  {
		   if((str.substring(i,i+3)).equals("xyz"))
		   {
		     
			   String s= str.substring(0,i);
				  String s1=str.substring(i+3);
					  if(s.length()==s1.length())
					  {
					  return true;
					  }
					  else if((s.length()+1)==s1.length())
					  return true;
					  else if(s.length()==(s1.length()+1))
					  return true;
					 
		   }
		  }
		  return false;
			}
	}


