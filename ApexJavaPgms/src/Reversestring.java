
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Computer Science";
System.out.println(reverse(str));
	}
	public static String reverse(String str)
	{
		String[] s1= str.split(" ");
		String s="";
		String result="";
		int j=0;
		while(j<s1.length)
		{
		for(int i=s1[j].length()-1;i>=0;i--)
		{
			s=s+s1[j].charAt(i);
		}
		result=result+s;
		s=" ";
		j++;
		}
		
		return result;
	}

}
