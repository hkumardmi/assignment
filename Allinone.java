package java_assign;
import java.util.Scanner;
class Fruits{
	public void show() {
		System.out.println("Welcome to Fruits World..");
	}
}
	// Inheritance
class Apple extends Fruits{
	//OverRidding
	public void show() {
		System.out.println("This is an Apple.");
	}
	//OverLoading
	public void ripeness(int a) {
		System.out.println("Ripe Mango");
	}
	public void ripeness(int a,int b) {
		System.out.println("Over Ripe Mango");
	}
}
//Encapsulation
class FruitName {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
}

abstract class FruitColor {
	public abstract void color();
}

class Pineapple extends FruitColor{
	public void color(){
	System.out.println("PineApple is Green..");
	}
}

public class Allinone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fr = new Fruits();
		Apple ap = new Apple();
		FruitName fn = new FruitName();
		fr.show();
		ap.show();
		ap.ripeness(3);
		ap.ripeness(3, 2);
		fn.setName("PineApple");
		System.out.println(fn.getName());
		FruitColor fc = new Pineapple();
		fc.color();
	}
}
