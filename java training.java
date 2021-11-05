import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		System.out.println("The answer is " + z);
		
		scanner.close(); //always good practise to close your scanner class
	
	}

}

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {

	public static void main (String[] args) {

		 Scanner scanner = new Scanner(System.in);
				 
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter a number of rows");
		rows = scanner.nextInt();
		System.out.println("Enter a number of columns");
		columns = scanner.nextInt();
		System.out.println("Enter character you want");
		symbol = scanner.next();
		
		for(int i = 1; i<= rows; i++) {
			System.out.println();
			for (int j = 1; j<= columns; j++) {
				System.out.print(symbol);
				
			}
		}
	}

}

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {

	public static void main (String[] args) {

		 String[] cars = new String[3];
		 
		 cars[0] = "mustang";
		 cars[1] = "corvette";
		 cars[2] = "chevy";
		 
		 for(int i=0; i<cars.length; i++) {
			 System.out.println(cars[i]);
		 }
	}

}


import java.util.*;

//2D array loop
public class Main {

	public static void main (String[] args) {
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
			ArrayList<String> bakeryList = new ArrayList();
			bakeryList.add("garlic bread");
			bakeryList.add("eggs");
			bakeryList.add("milk");
			bakeryList.add("sugar");
			
			ArrayList<String> produceList = new ArrayList();
			produceList.add("tomatoes");
			produceList.add("peppers");
			produceList.add("carrots");
			
			
			ArrayList<String> drinksList = new ArrayList();
			drinksList.add("soda");
			drinksList.add("water");
			
			//create a 2D array
			groceryList.add(bakeryList);
			groceryList.add(produceList);
			groceryList.add(drinksList);
			
			System.out.println(groceryList);
			//to retrieve only one list
			System.out.println(groceryList.get(0));
			//to retrieve the first index of the first list
			System.out.println(groceryList.get(0).get(0));
		 
	}

}

//For Each
import java.util.*;


public class Main {

	public static void main (String[] args) {
		//declare an array
		//String[] animals = {"cat", "dog", "lion", "birrd"};
		
		ArrayList<String> animals = new ArrayList();
		animals.add("rat");
		animals.add("bird");
		animals.add("fish");
		
		System.out.println(animals);
		
		
		//for each loop
		
		for(String i : animals) {
			System.out.println(i);
		}
	}

}

//Methods



public class Main {

	public static void main (String[] args) {
		String a = "Bayo";
		String b = "Rosa";
		int c = 123;
		//when you call the hello method, it displays what is in the block of code
		hello(a, b, c); // here a is an argument
		
	}

	static void hello(String a, String b, int  c) { // you need a matching set of parameters
		//anything within the set of parenthesis belongs to the method
		System.out.println(a + b + c);
	}
}

//Methods with Return types

public class Main {

	public static void main (String[] args) {
		
		//create a method that will add 2 numbers and return
		//the sum of them
		
		//first initialize 2 int variables
		int x = 2;
		int y = 3;
		int a = 4;
		int b = 6;
	
		//call the method
		sum(x, y);
		
		//call the method for return type
		System.out.println(add(a, b));
		
	}
	
	//create a method
	static void sum(int x, int y) {
		System.out.println(x + y);
	}
	
	//return type int
	 static int add(int a, int b) {
		 return a + b;
	 }
}

//Overloaded Method - methods that have the same name but different parameters

public class Main {

	public static void main (String[] args) {
		int x = add(1, 2, 6, 9, 6);
		
		System.out.println(x);
		
	 }
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;		
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;		
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	
	static int add(int a, int b, int c, int d, int e) {
		System.out.println("This is overloaded method #4");
		return a + b + c + d + e;		
	}
}


//rock paper scissors game
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main (String[] args) {
		
		//rock, paper, scissors game
		//rules are rock beats scissors, scissors beats paper, 
		//paper beats rock
		
		
		//get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type 1 for Rock, 2 for Paper and 3 for Scissors");
		int num = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		
		//find a random number between 0 and 3
		Random random = new Random();
		int x = random.nextInt(4);
		System.out.println(x);
	
		//conditional statement
		 if ((num > 1 && num < 3) && (x >= 1)) {
				System.out.println("paper beat rock");
			}else if ((num >= 1) && (x >= 3)) {
				System.out.println("rock beats scissors");
			}else if ((num >= 3) && (x >= 1 && x < 3)) {
				System.out.println("paper beats rock");
			}else {
				System.out.println("Game Over! start again!!");
			} 
		
	 }
	
}

//OOP

public class Main {

	public static void main (String[] args) {
		Car myCar1 = new Car();
		
		System.out.println(myCar1 .color);
		myCar1.brake();
				
	 }
	
}


public class Car {
	
	String make = "chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("you step on the brake");
	}

}

//constructor
public class Main {

	public static void main (String[] args) {
		Car myCar = new Car("toyota", 2022, 13.09);
		Car thatCar = new Car("Chevrolet", 2030, 16.70);
		
		 System.out.println(myCar.name);
		 System.out.println(myCar.year);
		 System.out.println();
		 System.out.println(thatCar.name);
		 System.out.println(thatCar.year);
		 
		 myCar.drive();
		 thatCar.brake();
		
	 }
	
}
 
public class Car {
	String name;
	int year;
	double price;
	
	Car(String name, int year, double price){
		this.name = name;
		this.year = year;
		this.price = price;			
	}
	
	void drive() {
		System.out.println(this.name + " is driving");
	}
	
	void brake() {
		System.out.println(this.name + " has stopped");
	}

}

//Global and local variables

//local - declared inside a method and visible to only that method
//global - declared outside a mehtod, but within a class and visible to all parts of the class
public class Main {

	public static void main (String[] args) {
		DiceRoller diceRoller = new DiceRoller();
	}
	
}
 
import java.util.Random;

public class DiceRoller {
	
	Random random; //global variable
	int num;
	
	DiceRoller(){
		 random = new Random();		//local variable
	}
	
	void roll() {
		num = random.nextInt(6)+1;
		System.out.println(num);
	}
}
//another way of writing this, but the top one is best as it has the global and local variable
DiceRoller(){
	random = new Random();		//local variable
	int num = 0;
	roll(random, num);
}

void roll(Random random, int num) {
   num = random.nextInt(6)+1;
   System.out.println(num);
}
}


//codewars


public class DiceRoller {
	public static boolean solution (String str, String ending) {
		char option = str.charAt((str.length())-1);
		char option2 = str.charAt((str.length())-2);
		char option3 = ending.charAt(0);
		char option4 = ending.charAt(1);
		if((option == option3) && (option2 == option4)) {
			return false;
		}
		return true;
	}

//OVERLOADED CONSTRUCTORS
public class Main {

	public static void main (String[] args) {
		DiceRoller diceRoller = new DiceRoller("thick crust", "tomato", "mozzarella", "peperoni");
		 
		System.out.println(diceRoller.bread);
	}
	
}
 


public class DiceRoller {
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	DiceRoller(String bread, String sauce, String cheese, String topping){//this is a normal constructor
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}

DiceRoller(String bread, String sauce, String cheese){//this is an overloaded constructor
	this.bread = bread;
	this.sauce = sauce;
	this.cheese = cheese;
	}

}


//TO STRING()
public class DiceRoller { //basically, class, constructor, arrays. everything is an object (with attributes and methods (or characters and behavior))
	String color;
	String model;
	int year;
	int number;
	
	
	 public String  toString() {
		return color+ "\n" + model+ "\n" + year + "\n" + number;
	}
}

public class DiceRoller {
	String color;
	String model;
	int year;
	int number;
	
	
	 public String  toString() {
		return color+ "\n" + model+ "\n" + year + "\n" + number;
	}
}


//STATIC MODIFIER
public class Main {

	public static void main (String[] args) {
		
		//static modifier is a modifier that can be applied to a variable/method. Anything that is static is also know as the static member.
		//the class that contains the static member owns the member. anything that the class own is shared by the instances of the class
		 
		//because the String numberoffriend is static and is owned by the class DiceRoller, you can access it using the class name
		//instead of using the name of the class instances to call it
		//DiceRoller diceRoller = new DiceRoller(123);
		//DiceRoller diceRoller2 = new DiceRoller(123);
				
		System.out.println(DiceRoller.numberofFriends);
		System.out.println(DiceRoller.numberofFriends);
		
		DiceRoller.displayFriends();
		
	}
	
}


public class DiceRoller {
	 
	int number;
	static int numberofFriends;
	
	DiceRoller(int number){
		this.number = number;
		numberofFriends++;
	}
	
	static void displayFriends() {
		System.out.println("you have " + numberofFriends + " friends");
	}
}

//INHERITANCE - uses the keyword extends
//main
public class Main {

	public static void main (String[] args) {
		Next dog = new Next();
		
		dog.speak();
		
		
	}
	
}
//parent class
public class DiceRoller {
	void speak() {
		System.out.println("This animal barks");
	}
	
}

//Child class
public class Next extends DiceRoller {
		
}


//OVERRIDE METHODS
//Main
public class Main {

	public static void main (String[] args) {
		DiceRoller dice = new DiceRoller();
		Next dog = new Next();
		
		dice.speak();
		dog.speak();		
	}
	
}

//parent class
public class DiceRoller {
	void speak() {
		System.out.println("This animal barks");
	}
	
}

//child class

public class Next extends DiceRoller {
	
	@Override
	  void speak() {
		System.out.println("This animal says woof woof");
	}
}


//SUPER KEYWORD
public class Main {

	public static void main (String[] args) {
		Next dice = new Next("batman", 42, "$$$");
		Next dice2 = new Next("superman", 40, "everything"); 
	
		
		System.out.println(dice2.toString());
		
		
	}
	
}
//parent class

public class DiceRoller {
	
	String name;
	int age;
	
	DiceRoller(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
}
//child class

public class Next extends DiceRoller {
	String superpower;
	
	Next(String name, int age, String superpower){
		super(name, age); //refers to the variables from the parent class   
		this.superpower = superpower;
	}
	
	public String toString() {
		return super.toString()+this.superpower;
	}

}

//ABSTRACT KEYWORD
public class Main {

	public static void main (String[] args) {
		//DiceRoller diceRoller = new DiceRoller();
		Next next = new Next(); 
		
	}
	
}
//Parent class
public abstract class DiceRoller {
	
	abstract void go();
}

//Child class
public class Next extends DiceRoller {
	
	@Override
	void go() {
		System.out.println("the car is moving");
	}

}

//ENCAPSULATION
public class Main {

	public static void main (String[] args) {
		DiceRoller diceRoller = new DiceRoller("toyota", "Acura", 1957);
		
		System.out.println(diceRoller.getYear());
		
		diceRoller.setYear(2022);
		
		System.out.println(diceRoller.getYear());		
	}	
}


public  class DiceRoller {
	
	private String make;
	private String model;
	private int year;
	
	DiceRoller(String make, String model, int year){
		//this.make = make;
		this.setMake(make);
		//this.model = model;
		this.setModel(model);
		//this.year = year;
		this.setYear(year);
	}
	public String getMake() {
		return make;
	}
	
	public int getYear() {
		return year; 
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

//INTERFACE (uses the implements keyword)
public class Main {

	public static void main (String[] args) {
		Next next = new Next();
		
		next.move();		
	}	
}

public interface DiceRoller {
	void move();	
}
 
public class Next implements DiceRoller {
	
	@Override
	public void move() {
		System.out.println("The car is moving");
	}
	
}


//POLYMORPHISM - The ability of an object to identify as more than one type
public class Main {
	public static void main (String[] args) {		
		 Next n = new Next();
		 Aah a = new Aah();
		 
		 DiceRoller[] dice = {n, a};
		 
		 for (DiceRoller x : dice) {
			 x.speak();
		 }
	}
}

public class DiceRoller {	
	public void speak() {
		System.out.println("Say Ah");
	}	
}

public class Next extends DiceRoller  {	
	@Override
	public void speak() {
		System.out.println("This is the way we go");
	}	
}

public class Aah extends DiceRoller{	
	@Override
	public void speak() {
		System.out.println("This is the way we move");
	}
}

//DYNAMIC POLYMORPHISM
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		//dynamic polymorphism - for when you do not know what the user will decide on
		DiceRoller dice;
		//Next n = new Next();
		//Aah a = new Aah();
		
		//dice.speak();		
		//n.speak();
		//a.speak();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number. Press 1 for Next, Press 2 for Aah");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			dice = new Next();
			dice.speak();
		}else if (choice == 2) {
			dice = new Aah();
			dice.speak();
		}else {
			System.out.println("WHAT DO YOU WANT FROM ME?");
			dice = new DiceRoller();
			dice.speak();
		}		
	}	
}

public class DiceRoller {
	
	public void speak() {
		System.out.println("Say Something please");
	}	
}

public class Next extends DiceRoller  {
	
	@Override
	public void speak() {
		System.out.println("This is the way we go");
	}	
}

public class Aah extends DiceRoller{
	
	@Override
	public void speak() {
		System.out.println("This is the way we move");
	}
}
