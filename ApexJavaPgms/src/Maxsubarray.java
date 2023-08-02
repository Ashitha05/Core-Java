
public class Maxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,-4,-2,6,3,-1};
		System.out.println(maxsubarray(arr));

	}

	public static int maxsubarray(int[] arr)
	{
		int currentSum=0;
		int maxSum=0;
		for(int i=0;i<arr.length;i++)
		{
			currentSum=currentSum+arr[i];
			if(currentSum>maxSum)
			{
				maxSum=currentSum;
			}
			else if(currentSum<0)
			{
				currentSum=0;
			}
		}
		return maxSum;
	}
}
