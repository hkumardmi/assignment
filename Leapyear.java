package java_assign;
import java.util.Scanner;

public class Leapyear {
	public String check(int year){
		if(year % 4 == 0) {
			return "Its a Leap Year";
		}else {
			return "Its not a Leap Year";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leapyear lp = new Leapyear();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		String result = lp.check(year);
		System.out.println(result);
	}

}
