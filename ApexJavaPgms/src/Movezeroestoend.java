
public class Movezeroestoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,6,0,3,8,9,0,2,0};
		movezeroes(arr);

	}
	public static void movezeroes(int[] arr)
	{
		int count=0;
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		while(count<len)
		{
			arr[count++]=0;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
