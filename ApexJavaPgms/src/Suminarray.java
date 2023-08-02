import java.util.Arrays;

public class Suminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[2];
		int[] arr=  {2,15,11,5};
		
		System.out.println(arraySum(arr,16));

	}
	public static String arraySum(int[] arr,int sum)
	{
		int[] a= new int[2];
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==sum)
			{
				a[0]=arr[i];
				a[1]=arr[j];
				return Arrays.toString(a);
			}
			
		}
		
	}
		return Arrays.toString(a);
	}

}
