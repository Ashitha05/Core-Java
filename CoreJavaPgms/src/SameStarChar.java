
public class SameStarChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sameStarChar("*xa*a*b"));
	}
	public static boolean sameStarChar(String str)
	{
		int j=0;
		  boolean flag=false;
		  if(!(str.contains("*")))
			  return true;
		  for(int i=1;i<str.length();i++)
		  {
		    if(str.charAt(i)=='*')
		    {
		      if(str.charAt(i-1)==str.charAt(i+1))
		    return true;
		      else 
		      flag=false;
		    }
		    else
		    flag=true;
		  }
		return flag;
	}

}
