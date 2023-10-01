package exceptionpractice;
import java.util.*;

class calculation{
	int a = 10;
	int b = 0;
	int c;
	calculation(){
		try {
			c = a/b;
			System.out.println(c);	
		}
		catch(ArithmeticException e) {
			System.out.println("The denominator is zero hence try another denominator");	
		}
		
	}
}

// testing start
class testing{
	
	
	
	testing(){
		String input;
		
		System.out.println("Enter your value 1. one to confirm digits 2. to change the case" );
	
		Scanner i = new Scanner(System.in);
		input = i.nextLine();
		
//		if statement
		if(input.equals("1")) {
			for(int k = 0; k<input.length(); k++) {	
				char c = input.charAt(k);
				if(Character.isDigit(c)) {
					System.out.println(c + " is a digit");
				}
				else {
					System.out.println(c + " is not a digit");
				}
			}
		}
		
//		
	
	}
	}
// testing end

class conversion extends testing{
	
}

class calc{
	private int a;
	private int b;
//	Getters
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
//	Setters
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
//	Constructor
	calc(){
		float c;
		System.out.println("Enter your a and b");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b= input.nextInt();
		c = a/b;
		System.out.println(c);
		input.close();
	}
}

class exception{
	int a, b,c;
	exception(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number a :");
		a=sc.nextInt();
		System.out.println("Enter your number b :");
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Your denominator value is zero");
		}
		
	}
}


class Array{
	Array(){
	int[]A = {8,5,4,0};
	try {
		int c = A[0]/A[3];
		System.out.println(c);
	try {
		System.out.println(A[2]);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
System.out.println("Bye");	
}
}


// StudentAssessment class
class StudentAssessment {
	private int chemistry;
	private int physics;
	private int biology;
	boolean conditionMet;
	
//	Getters start
	public int getChemistry() {
		return chemistry;
	}
	public int getPhysics() {
		return physics;
	}
	public int getBiology() {
		return biology;
	}
//	Getters end

	StudentAssessment(int sub){
		 chemistry = physics = biology = sub ;
		String result = "0";
		
		result = result + sub;
		System.out.println(result);
		
//		char number = sub.;
		
		for(int i = 0; i<result.length(); i++) {
			char number = result.charAt(i);
			if(result.length()<=3) {
				System.out.println("Your numbers are: " + number);
				conditionMet = true;
			}
			
		
		}
		if(!conditionMet ) {
			System.out.println("It is more than 3");
		}
	
	
	}
	
}

public class Execptionpractice {

	public static void main(String[] args) {
		new StudentAssessment(42);
		// TODO Auto-generated method stub

	}

}