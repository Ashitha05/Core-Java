
public class XyBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
xyBalance("x");
	}
	public static boolean xyBalance(String str)
	{
		 boolean flag=true;
		 
		  for(int i=0;i<str.length()-1;i++)
		  {
		    if(str.charAt(i)=='x')
		    {
		      if((str.substring(i+1)).contains("y"))
		      {
		        flag=true;
		      }
		      else
		      return false;
		    }
		  }
		  return flag;
	}

}
