
public class Removex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(removex("xabcdx"));
	}



public static String removex(String str)
{
	if (str.length() == 0) {
        return str;
    }

    if (str.charAt(0) == 'x') {
        str = str.substring(1);
    }

    if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
        str = str.substring(0, str.length() - 1);
    }

    return str;
}
}
