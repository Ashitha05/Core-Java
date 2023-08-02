import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count");
		int x=sc.nextInt();
		int i = 1,firstTerm = 0, secondTerm = 1;
		while ( i <= x) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		
		

	}

	}
}
