package java_assign;
import java.util.Scanner;
public class Comp {
	public int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Comp cp = new Comp();
		System.out.println("Enter the First Number");
		System.out.println("Real Number(only integer + Symbol)");
		int r1 = sc.nextInt();
		System.out.println("Imaginary Number(only integer + Symbol)");
		int i1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		System.out.println("Real Number(only integer + Symbol)");
		int r2 = sc.nextInt();
		System.out.println("Imaginary Number(only integer + Symbol)");
		int i2 = sc.nextInt();
		int a = cp.add(r1,r2);
		int b = cp.add(i1,i2);
		System.out.println(a + "+" +b + "i");
		
	}

}
