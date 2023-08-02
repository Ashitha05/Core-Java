import java.util.HashSet;

public class Longestsequesnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 5, 3, 7, 4, 8 };
		System.out.println(LongSeq(arr));

	}

	public static int LongSeq(int[] arr) {
		int longseq = 0;
		int currentNum = 0;
		int currentSeq = 0;
		HashSet<Integer> numset = new HashSet<Integer>();
		for (int num : arr) {
			numset.add(num);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (!(numset.contains(arr[i] - 1))) {
				currentNum = arr[i];
				currentSeq = 1;

				while (numset.contains(currentNum + 1)) {
					currentNum++;
					currentSeq++;
				}
				longseq = Math.max(currentSeq, longseq);
			}
		}

		return longseq;
	}

}
