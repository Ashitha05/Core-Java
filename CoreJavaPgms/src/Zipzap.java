
public class Zipzap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(zipZap("zipXzap"));
	}
	public static String zipZap(String str) {
		  String s="";
		 
		  for(int i=0;i<=str.length()-1;i++)
		  {
		    if(str.charAt(i)!='z')
		    {
		      s=s+str.charAt(i);
		    }
		    if(str.charAt(i)=='z')
		    {
		      if(str.charAt(i+2)=='p')
		      {
		        s=s+str.charAt(i)+str.charAt(i+2);
		        i=i+2;
		      }
		      else
		      s=s+str.charAt(i);
		    }
		  }
		  return s;
		}

}
