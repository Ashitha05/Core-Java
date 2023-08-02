
public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
xyzThere(".xyz");
	}

	public static boolean xyzThere(String str) {
		  boolean flag=true;
		  if(str.length()<3)
		  return false;
		  else if(str.length()==3)
		  {
		    if(str.equals("xyz"))
		    return true;
		    else
		    return false;
		  }
		  if(str.contains("xyz"))
		  {
		  for (int i=0;i<str.length()-2;i++)
		  {
		    if((str.charAt(i))=='.')
		    {
		      if((str.substring(i+1,i+4)).equals("xyz"))
		      return false;
		    }
		    else
		    flag=true;
		  }
		  return flag;
		  }
		  else
		  return false;
		  
		}
}

