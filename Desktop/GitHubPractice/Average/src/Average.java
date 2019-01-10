import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// I fixed spelling of static and void
		Scanner sc = new Scanner( System.in );
		// changed in.System to System.in
		System.out.println("Please enter an integer");
		// inserted a . after System and out, and fixed integer spelling
		int num1 = sc.nextInt();
		System.out.println("Please enter second integer");
		// inserted a . after System and out, and fixed integer spelling
		int num2 = sc.nextInt();
		double avg = (num1 + num2) / 2;
		// added a ;
		System.out.println( avg );
		// fixed spelling
	}
	// added closing bracket
	

}