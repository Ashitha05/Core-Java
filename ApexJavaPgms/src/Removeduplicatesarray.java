import java.util.Arrays;

public class Removeduplicatesarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,5,5,7,8,8,9};
System.out.println(removeDup(arr));
	}

	public static String removeDup(int[] arr)
	{
		int[] rem= new int[arr.length];
		int j=0;
		
		for (int i=0;i<arr.length-1;i++)
		{
			if (arr[i] != arr[i + 1]) {
                rem[j] = arr[i];
                j++;
            }
		
			
		}
		
		rem[j] = arr[arr.length - 1];
        j++;
        int[] result = Arrays.copyOf(rem, j);
		return Arrays.toString(result);
		
		
	}
}
