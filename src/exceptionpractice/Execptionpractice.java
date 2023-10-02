package exceptionpractice;
import java.util.*;
import java.io.*;

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

// Alphabet check start
class AlphabetCheck{
	private String check;
//	getters
	public String getCheck() {
		return check;
	}
	AlphabetCheck(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your words/values");
		check = sc.nextLine();
		
	for(int i = 0; i<check.length(); i++) {
		char c = check.charAt(i);
		if(Character.isDigit(c)) {
			System.out.println(c +  " = It is a digit");
		}
		else if(Character.isAlphabetic(c)) {
			System.out.println(c + " = It is an alphabet");
		}
		else {
			System.out.println(c + " = is neither an alphabet nor a digit");
		}
	}
	}
	
}
//Alphabet check end

//Array check start
class Arraycheck{
	Arraycheck(){
		int number;
		int index;
		Scanner sc = new Scanner(System.in);
//		try start
		try {
			System.out.println("How many numbers you want in an array");
			number = sc.nextInt();
			System.out.println("Put the numbers inside");
			for(int i = 1; i<=number; i++) {
				index = sc.nextInt();
				
			
				int[] x = new int[number];
				

				for(int k = 0; k<number; k++) {
					index = x[k];
					System.out.println(x[k] );
				}
				
			}
			System.out.println("You have " + number);
		}
//		try start
		
//		catch start
		catch(InputMismatchException e) {
			System.out.println(e);
		}
//		catch end		
	
		
	}
}
//Array check end

class lowBalanceException extends Exception{
	
	public String toString() {
		return "Value should be more than N5000";
	}
}


class ArrayChecck2{
	ArrayChecck2(){
		try {
			throw new lowBalanceException();
	}
		catch(lowBalanceException e) {
		System.out.println(e);
	
		}
	}
}


class AgeException extends Exception{
	public String toString() {
		return "Your age is not a digit bro";
	}
}

class personInput{
	Integer age;
	String str = "";
	char c;
	personInput() throws AgeException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = input.nextInt();
		str = str + age;
		for(int i = 0; i<str.length(); i++) {
			 c = str.charAt(i);
		}
		if(Character.isAlphabetic(c)) {
			throw new AgeException();
		}
			System.out.println("You are " + str + " years old");
	}
}




public class Execptionpractice  {
	
	static int rectangleArea()  {
		return 10/0;
	}
	static int rectanglemeth1() {
		try {
			return rectangleArea();
		}
		catch(Exception e) {
			 System.out.println("Exception caught in rectanglemeth1: " + e);
			return 2;
			
		}
		}
	
	
	
	static int Rectangle2Area(int l,int b) throws Exception{
		if(l<0 || b<0) {
			throw new Exception();
		}
		return l*b;
	}
	static void rectanglemeth2() throws Exception {
		System.out.println(Rectangle2Area(3,4));
	}
	static int area(int l, int b) throws Exception {
		if(l<0 || b<0) {
			throw new Exception();
			
			
		}
		return l*b;
		
	}
	static void meth2() throws Exception {
		System.out.println(area(-3,4));
	}


	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		new personInput();

		
	}

}