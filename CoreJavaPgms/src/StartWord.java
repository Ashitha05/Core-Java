
public class StartWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(startWord("hippo","hi")); 
	}
	
	public static String startWord(String str, String word)
	{
		if (word.length() > str.length()) {
            return "";
        }

        if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }

        return "";
	}

}
