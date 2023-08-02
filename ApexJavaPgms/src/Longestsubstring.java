import java.util.HashSet;
public class Longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(longestSub("abcbcdeff"));
	}

	public static int longestSub(String s)
	{
		
		int n = s.length();
        int maxLength = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
	
	}
}
