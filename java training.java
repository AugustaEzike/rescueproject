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


//EXCEPTIONS
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		//EXCEPTIONS try catch block and finally
		Scanner scanner = new Scanner(System.in);
		try {			
			System.out.println("Enter a whole number to divide");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by:");
			int y = scanner.nextInt();
			
			int z = x/y;
			System.out.println(z);			
		}
		catch (ArithmeticException e) {
			System.out.println("the math is not mathing, try again");
		}catch (InputMismatchException e) {
			System.out.println("Cannot divde by a non number, please enter a number");			
		}catch (Exception e) { //catches all exception. usually good practise not to use this and to catch exceptions individually
			System.out.println("Something went wrong, please try again");
		}
		finally {
			scanner.close();
			System.out.println("This will always print ");
		}		
	}	
}

//Banking Application
package bankingapplication;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank bank;
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, What is your name?");
		String name = scanner.next();
		System.out.println("What would you like to do? "
				+ "Press 1 for Deposit, Press 2 for Withdrawal"
				+ "Press 3 to check account balance"
				+ "Press 4 to display last 5 transactions"
				+ "Press 5 to Exit");
		int mainChoice = scanner.nextInt();
		
		if (mainChoice == 1) {
			System.out.println("Where would you like to deposit? Press 1 for Savings, press 2 for Chequing");
			int depChoice = scanner.nextInt();
			if (depChoice == 1) {
				bank = new SavingsAccount();
				bank.depSpeak();
			}else if (depChoice == 2){
				bank = new ChequingAccount();
				bank.depSpeak();
			} else {
				System.out.println("that option does not exist, please try again");
				scanner.nextInt();
			}
		} else if(mainChoice == 2) {
			System.out.println("Where would you like to withdraw from? Press 1 for Chequings Press 2 for Savings");
			int withChoice = scanner.nextInt();
			if (withChoice == 1) {
				bank = new SavingsAccount();
				bank.withSpeak();
			}else if (withChoice == 2) {
				bank = new SavingsAccount();
				bank.withSpeak();
			}else {
				System.out.println("That option does not exist, Please try again");
			}
		} else if (mainChoice == 3) {
			bank = new Bank();
			bank.checkAcc();
		} else if (mainChoice == 4) {
			System.out.println("Here are the last 5 transactions that occured");
		} else if (mainChoice == 5) {
			System.out.println("Have a nice day!");
		}
	}	
}

package bankingapplication;

 
public class Bank {

	int total;
				
	public void depSpeak() {
		System.out.println("Say Something please");
	}	
	
	
	public void withSpeak() {
		System.out.println("Say Something please");
	}	
	
	public void checkAcc() {
		SavingsAccount a = new SavingsAccount();
		ChequingAccount b = new ChequingAccount();
		 total = a.amount + b.amt;
		 System.out.println("Your total amount is: $" + total);		 
	}
}

package bankingapplication;

import java.util.Scanner;

public class ChequingAccount extends Bank {
int amt;


	
	@Override	
	//deposit money into chequing account
	public void depSpeak() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to deposit");
		int cheqDep = scanner.nextInt();
		amt = amt + cheqDep;
		System.out.println("Your new balance is: $" + amt);				
	}
	
	@Override
	//withdraw money from chequing account
	public void withSpeak() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to Withdraw");
		int cheqWith = scanner.nextInt();
		if (amt <= 0) {
			System.out.println("You have insufficient funds to make a withdrawal. Would you like to make a deposit? Press 1 for yes or 2 for No");
			Scanner n = new Scanner(System.in);
			int c = n.nextInt();
			if (c == 1) {
				depSpeak();
			}
		}else {			
			amt = amt - cheqWith;
		}		
		System.out.println("Your new balance is: $" + amt);				
	}
	//check account
	public void checkAcc() {
		System.out.println("Your account balance is: $" + amt);
	}
}

package bankingapplication;

import java.util.Scanner;

public class SavingsAccount extends Bank {
	int amount = 0;
	
	
	
	@Override
	//deposit money into savings account
	public void depSpeak() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to deposit");
		int savDep = scanner.nextInt();
		amount = amount + savDep;
		System.out.println("Your new balance is: $" + amount);				
	}
	
	@Override
	//withdraw money from savings account
	public void withSpeak() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much would you like to Withdraw");	
		int withDep = scanner.nextInt();
		if (amount <= 0) {
			System.out.println("You have insufficient funds to make a withdrawal. Would you like to make"
					+ " a deposit? Press 1 for yes or 2 for No");
			Scanner s = new Scanner(System.in);
			int C = s.nextInt();
			if (C == 1) {
				depSpeak();
			}
		}else {			
			amount = amount - withDep;
		}		
		System.out.println("Your new balance is: $" + amount);		
	}
	
	//Check account balance
	public void checkAcc() {
		System.out.println("Your account balance is: $" + amount);
	}
}


//FILE WRITER
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main (String[] args) {
		try {
			FileWriter writer = new FileWriter("Poem.txt");
			writer.write("Roses are red \n violets are blue \n booty \n rocking everywhere ");
			writer.append("A silly Poem");
			writer.close();			
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}	
}
 

//FILE READER
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main (String[] args) {
		try {
			FileReader reader = new FileReader("Poem.txt");
			int data = reader.read(); //continue reading this file as long as data does not = -1
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}reader.close();
						
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
}

//WORKING WITH AUDIO FILES
//Creating a basic audio player (works only with wav. files and not mp3, you will need to convert all files to wav.)
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main (String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("it-is-so.wav"); // copy music file into the src directly. it should be on the same level with the default package 
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
				
		String response = " ";
		
		while (!response.equals("Q")) {
			System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter your choice: ");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
			case ("P"): clip.start();
			break;
			case ("S"): clip.stop();
			break;
			case ("R"): clip.setMicrosecondPosition(0); //sets the reset to what time in micro seconds
			break;
			case ("Q"): clip.close();
			break;
			default: System.out.println("Not a valid response");
			}
		}
		System.out.println("Byee");
	}	
}

//GUI Frame
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main (String[] args) {
		//JFrame = a GUI window to add components to 
		
		JFrame frame = new JFrame(); // creates a frame (an instance of a frame. Frame is not visible, so you need to set the visibility to true)
		frame.setVisible(true); //makes frame visible
		frame.setSize(420, 420); //sets the x-dimension and y-dimension of frame
		frame.setTitle("JFrame Title Goes here"); // sets title of frame
		
		//when you run this,. there is a little x button on the gui. when clicked, it will hide the frame but not close out the program.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application. the default is HIDE_ON_CLOSE which make it seem like it is closed but just hides the frame
		//DO_NOTHING_ON_CLOSE prevents someone from closing the app, even if the x button is hit
		frame.setResizable(false);//prevents the frame from being resized
		
		ImageIcon image = new ImageIcon("logo.png"); //creates an image icon
		frame.setIconImage(image.getImage()); //changes icon on the gui from the default java icon to the preferred icon(logo.png which has to be saved in the project folder)
		frame.getContentPane().setBackground(Color.green);//this will change color of background
		//frame.getContentPane().setBackground(new Color(0, 0, 255)); // this is for RGB colors if you do not want a set color(123, 50, 250). you can also use a hexidecimal color e.g 0x123456		
		
		/*another way of creating a gui is to make a new class and make the class extend Jframe. 
		 * then in the new class, make a constructor and then this. everything you need
		 * will be in the constructor class. then in the main class, make an instance of the new class. 
		 *  
		 */
	}	
}
 
//LABELS
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Font;

public class Main {

	public static void main (String[] args) {
		
		Border border = BorderFactory.createLineBorder(Color.green,3); //creates a line border for the label, color is green and line size is 3
		ImageIcon image = new ImageIcon("src/cart.png");
		JLabel label = new JLabel(); // creates the label
		label.setText("What are you doing?"); //set text of label.
		label.setIcon(image);//adds the image to the label
		label.setHorizontalTextPosition(JLabel.CENTER); //setHorizonalPosition has 3 positions. JLable.center, JLabel.LEFT or JLabel.RIGHT
		label.setVerticalTextPosition(JLabel.TOP); //has 3 positions for verticalTextPosition: TOP, CENTER and BOTTOM
		label.setForeground(new Color(0x00FF00)); //sets the color of the label text
		label.setFont(new Font ("MV Boli", Font.PLAIN, 20)); //sets the font of the text in the label, the font name is MV Boli, font is plain and the font size is 20
		label.setIconTextGap(100); //can be a positive or negative integer. sets gap of text to image
		label.setBackground(Color.black); //sets background color for the label
		label.setOpaque(true); //displays background color so that the label background is visible
		label.setBorder(border); //sets the border of the label
		label.setVerticalAlignment(JLabel.CENTER); //Sets the vertical position of the icon + text within the label to the center
		label.setHorizontalTextPosition(JLabel.CENTER); //sets the horizontal position of the icon + text within the label to the center
		//label.setBounds(0,0, 250, 250); // x-position, y-position, width and height for the bounds
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label); //adds the label to the frame
		frame.pack(); //resize the size of the frame to accommodate all the components that you are working with. if you use the .pack method, make sure you add all the components first before you .pack, or it doesnt work
		
	}	
}

//PANELS
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Font;

public class Main {

	public static void main (String[] args) {
		
		//JPANEL - a GUI component that functions as a container to hold other componets
		ImageIcon icon = new ImageIcon("cart.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(redPanel); 	//add panel to frame
		frame.add(bluePanel);
		frame.add(greenPanel);
		redPanel.add(label);		
	}	
}
 
//BUTTONS
import learningJava.MyFrame;

public class Main {

	public static void main (String[] args) {
		
		//JButton - a GUI button that performs an action when you click on it
		
		new MyFrame();
	}	
}
 

package learningJava;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener{ //JFrame parent class does not need to be created. it is a package that needs to be imported
//import the action listener to listen to when the button is clicked
	
	JButton button; //make it a global variable
	JLabel label;
	
	public MyFrame(){
		ImageIcon icon = new ImageIcon("cart.png");
		ImageIcon icon2 = new ImageIcon("cart.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 150, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(200,100,100,50);
		button.addActionListener(this);
		button.setText("I am a text");
		button.setFocusable(false); //removes the annoying border around the text
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false); //disables the button
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button); 
		this.add(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Yes");
			label.setVisible(true);
		}
	}
}

//BORDER LAYOUT

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;


public class Main {

	public static void main (String[] args) {
		
		JFrame frame = new JFrame(); //create a new frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation to exit
		frame.setSize(500,500); //size of the GUI frame
		frame.setLayout(new BorderLayout(10, 5)); // the integers set the margins for the width and the height. not really necessary except you need to 
		frame.setVisible(true); //GUI to visible		
		
		//create panels within the GUI frame
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		//give each panel a color
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.yellow);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.magenta);
		
		//set size of panels
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//---------------------------------------------------
		//--------------------SUB-PANELS---------------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		//give each panel a color
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.orange);
		panel8.setBackground(Color.pink);
		panel9.setBackground(Color.gray);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout());
		
		//set size of panels
		panel6.setPreferredSize(new Dimension(10,10));
		panel7.setPreferredSize(new Dimension(10,10));
		panel8.setPreferredSize(new Dimension(10,10));
		panel9.setPreferredSize(new Dimension(10,10));
		panel10.setPreferredSize(new Dimension(10,10));
		
		//--------------------SUB-PANELS---------------------
		//---------------------------------------------------		
		
		//add panels to frame
		frame.add(panel1, BorderLayout.NORTH); //NORTH expands horizontally, not vertically
		frame.add(panel2, BorderLayout.WEST); //WESt expands vertically, not horizontally
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.WEST);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.SOUTH);
		panel5.add(panel10, BorderLayout.CENTER);
	}	
}

//FLOW LAYOUT
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;


public class Main {

	public static void main (String[] args) {		
		
		JFrame frame = new JFrame(); //create a new frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation to exit
		frame.setSize(500,500); //size of the GUI frame
		//frame.setLayout(new FlowLayout()); //The default parameter for FlowLayout is FlowLayout.CENTER, .LEADING makes the buttons appear on the right, .TRAILING makes the buttons appear on the left
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //the integer sets the horizontal and vertical alignment		
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		frame.setVisible(true); //GUI to visible
	}	
}
 
//GRID LAYOUT

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;


public class Main {

	public static void main (String[] args) {		
		
		JFrame frame = new JFrame(); //create a new frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation to exit
		frame.setSize(500,500); //size of the GUI frame
		//frame.setLayout(new FlowLayout()); //The default parameter for FlowLayout is FlowLayout.CENTER, .LEADING makes the buttons appear on the right, .TRAILING makes the buttons appear on the left
		frame.setLayout(new GridLayout(3,3 , 10, 10)); //this sets the amount of rows, colums, horizontal and vertical spacing (in pixels)		
				
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
	
		frame.setVisible(true); //GUI to visible		
	}	
}

//LAYERED PANE
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;


public class Main {

	public static void main (String[] args) {		
				
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);

		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);

		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		layeredPane.add(label1, Integer.valueOf(1)); //the higher the integer, the more on top the panel will be
		layeredPane.add(label2);
		layeredPane.add(label3);
		
		JFrame frame = new JFrame(); //create a new frame
		frame.add(layeredPane);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation to exit
		frame.setSize(500,500); //size of the GUI frame
		//frame.setLayout(new FlowLayout()); //The default parameter for FlowLayout is FlowLayout.CENTER, .LEADING makes the buttons appear on the right, .TRAILING makes the buttons appear on the left
		frame.setLayout(null); 
		frame.setVisible(true); //GUI to visible
	}	
}
 
//OPENING A NEW WINDOW EVEYTIME
//main

public class Main {

	public static void main (String[] args) {
		Aah launch = new Aah();
				
		

	}	
}

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aah implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	Aah(){
		
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(420,420);
		 frame.setLayout(null);
		 frame.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {//event listener
		if(e.getSource()== myButton) {
			frame.dispose(); //this makes sure that you do not have new/multiple windows opening everytime you click on new window
			DiceRoller newWindow = new DiceRoller();
		}		
	}
}

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DiceRoller {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	
	DiceRoller(){
		label.setBounds(0, 0, 100, 50 );
		label.setFont(new Font(null, Font.PLAIN, 25));
		frame.add(label);
		
		
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(420,420);
		 frame.setLayout(null);
		 frame.setVisible(true);
	}	
}

//CREATING A DIALOGUE BOX
import javax.swing.JOptionPane;

public class Main {

	public static void main (String[] args) {
		//How to create a dialog box 
		JOptionPane.showMessageDialog(null, "This is how to create a Dialog Box", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "That method does not exist", "title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Do you want to exit the eindow?", "title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "You are accessing a dangerous file", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Something is wrong, seek IT help", "title", JOptionPane.ERROR_MESSAGE);

		
		int answer = JOptionPane.showConfirmDialog(null, "Are you ready?", "Game Time", JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showOptionDialogue - //gives you the option to put in your own custom buttons or icons	
		
	}	
}
 

//SLIDER

public class Main {
	public static void main (String[] args) {
		//How to create a slider
		
		Aah slider = new Aah();		
	}	
}

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Aah implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	Aah(){
		frame = new JFrame("slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50); // the first 2 numbers are the minimum and the maximum that you can set the range to be between, 
								//the third number is the starting point, where you want the slider to be positioned at to begining
		slider.setPreferredSize(new Dimension(400, 200)); //width and height
		slider.setPaintTicks(true); //this shows the ticks for the measurement
		slider.setMinorTickSpacing(10); //determines the distance/measurement between each ticks
		slider.setPaintTrack(true); //this shows the tracks measurement
		slider.setMajorTickSpacing(25); //this shows the distance between each major tracks
		slider.setPaintLabels(true); //shows the number on the slider
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		slider.setOrientation(SwingConstants.VERTICAL);//changes the orientation to vertical
		//slider.setOrientation(SwingConstants.HORIZONTAL);//changes the orientation to horizontal
		slider.addChangeListener(this);// this because we are implementing change listener in this public class
		label.setText("°C = " + slider.getValue()); //slider.getValue will get the value or the measurement of where the slider is currently at on the slide range
		label.setFont(new Font("MV Boli", Font.PLAIN, 50));
	
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420); 
		frame.setVisible(true);
	}	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + slider.getValue()); //in this statechange method, whever the state changes for the slider, it would execute this code		
	}
}

//PROGRESS BAR

public class Main {
	public static void main (String[] args) {
		Aah progressBar = new Aah();
	}	
}

import java.awt.*;
import javax.swing.*;

public class Aah {
	JFrame frame;
	JProgressBar bar;
	
	Aah(){		
		bar = new JProgressBar(0, 500); //minimum and maximum value
		bar.setValue(0);
		bar.setBounds(0,0,500,50);//because you are using a no layout manager, you will need to set the bounds 
									//in this order: x dimension, y-dimension, length and height(in pixel)
		bar.setStringPainted(true);// adds a percentage to progress bar which changes are the bar fills up
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.red);//the fill color is red
		bar.setBackground(Color.black);//background is black
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(bar);
		
		fill();		
	}

	public void fill() {
		int counter = 500;
		while (counter >0) {
			bar.setValue(counter);
			try {
				Thread.sleep(100); //simulates bar increasing over a set period of time (in milliseconds. 1000 milliseconds = 1 sec)
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
			counter -=1;
		}
		bar.setString("done"); //after the bar is done, it will comment done
	}
}
 
//MENU BAR

public class Main {

	public static void main (String[] args) {
		Aah menu = new Aah();
	}	
}
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;


public class Aah extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu file;
	JMenu edit;
	JMenu help;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	Aah(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());		
		this.setVisible(true);
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		//create icons
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		//set icons
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		//This is to use keyboard shortcuts
		loadItem.setMnemonic(KeyEvent.VK_L);//L for load
		saveItem.setMnemonic(KeyEvent.VK_S);//S for save
		exitItem.setMnemonic(KeyEvent.VK_E);//E for exit
		file.setMnemonic(KeyEvent.VK_F);//Alt + F for file
		edit.setMnemonic(KeyEvent.VK_E);//Alt + E for edit
		help.setMnemonic(KeyEvent.VK_H);//Alt + H for help
		
		
		file.add(loadItem);
		file.add(saveItem);
		file.add(exitItem);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == loadItem) {
			System.out.println("file loading");
		} else if(e.getSource() == saveItem) {
			System.out.println("get program");
		} else if (e.getSource() == exitItem) {
			System.exit(0); //exits the program
		}
	}

}

//GUI CHECKBOXES
public class Main {
	
	public static void main (String[] args) {
		Aah checkbox = new Aah();
		
	}	
}

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aah extends JFrame implements ActionListener {
	JCheckBox checkbox1;
	JCheckBox checkbox2;
	JCheckBox checkbox3;
	JCheckBox checkbox4;
	JCheckBox checkbox5;
	JButton button;
	
	//to add icons to the checkbox
	ImageIcon xIcon;
	ImageIcon checkIcon;
	Aah(){
		
		checkbox1 = new JCheckBox();
		checkbox2 = new JCheckBox();
		checkbox3 = new JCheckBox();
		checkbox4 = new JCheckBox();
		checkbox5 = new JCheckBox();
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);//since an ActionListener is being implemented, pass in this 
		
		//adding icons to the checkbox
		//xIcon = new ImageIcon("x.png"); //this would be the image path in the folder
		//checkIcon = new ImageIcon("check.png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		checkbox1.setText("pizza");
		checkbox2.setText("donut");
		checkbox3.setText("rolls");
		checkbox4.setText("breadsticks");
		checkbox5.setText("taco");
		checkbox1.setFocusable(false); //this removes the border around the checkboxes
		checkbox2.setFocusable(false);
		checkbox3.setFocusable(false);
		checkbox4.setFocusable(false);
		checkbox5.setFocusable(false);
		checkbox1.setFont(new Font("MV Boli", Font.PLAIN, 35)); //font type, style and font size
		checkbox2.setFont(new Font("MV Boli", Font.PLAIN, 35));
		checkbox3.setFont(new Font("MV Boli", Font.PLAIN, 35));
		checkbox4.setFont(new Font("MV Boli", Font.PLAIN, 35));
		checkbox5.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		//checkbox.setIcon(xIcon);
		//checkbox.setSelectedIcon(checkIcon); //setSelectedIcon makes you able to toggle between 2 icons when it is selected or clicked
		
		this.add(button);
		this.add(checkbox1);//add before you pack
		this.add(checkbox2);
		this.add(checkbox3);
		this.add(checkbox4);
		this.add(checkbox5);
	
		this.pack();
		this.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //this listens for events
		if(e.getSource() == button) {
			System.out.println(checkbox.isSelected()); 
		}		
	}	
}
 
//Radio Button
public class Main {
	
	public static void main (String[] args) {
		Aah radio = new Aah();
		
	}	
}

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aah extends JFrame implements ActionListener {
	//RadioButton - one or more buttons in a grouping in which only one may be selected
	
	JRadioButton pizzaButton;
	JRadioButton donutButton;
	JRadioButton hamburgerButton;
	JRadioButton crutonButton;
	
	Aah(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		pizzaButton = new JRadioButton("Pizza");
		donutButton = new JRadioButton("Donut");
		hamburgerButton = new JRadioButton("Hamburger");
		crutonButton = new JRadioButton("Cruton");
		
		//create a button group. this add all the buttons to a group so you can only select one button
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(donutButton);
		group.add(hamburgerButton);
		group.add(crutonButton);
		
		//add font and font styling
		pizzaButton.setFont(new Font ("MV Boli", Font.PLAIN, 35));
		donutButton.setFont(new Font ("MV Boli", Font.PLAIN, 35));
		hamburgerButton.setFont(new Font ("MV Boli", Font.PLAIN, 35));
		crutonButton.setFont(new Font ("MV Boli", Font.PLAIN, 35));		
		
		//adds the button to the frame
		this.add(pizzaButton);
		this.add(donutButton);
		this.add(hamburgerButton);
		this.add(crutonButton);
		
		//add Action listener to each button
		pizzaButton.addActionListener(this);
		donutButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		crutonButton.addActionListener(this);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("You get Pizza");
		}else if (e.getSource() == donutButton) {
			System.out.println("you ordered donut");
		}else if (e.getSource() == hamburgerButton) {
			System.out.println("you get hamburger");
		}else if(e.getSource() == crutonButton) {
			System.out.println("where are my crutons?");
		}		
	}	
}

//FILE CHOOSER
public class Main {
	
	public static void main (String[] args) {
		Aah file = new Aah();		
	}	
}

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Aah extends JFrame implements ActionListener {	
		
	JButton button;
	Aah(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		button = new JButton("Submit Button");
		button.addActionListener(this);		
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			//to set current directory. this means that the files will be opened/saved to this directory only 
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Augusta Ezike\\Desktop"));
			
			//int response = fileChooser.showOpenDialog(null);//if you have a parent component, put it in there otherwise, add null.
															//select file to open. usual response is an integer value, 0 for file opened, 1 for cancel 
			int response = fileChooser.showSaveDialog(null); //to select file to save
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());// this returns the file path of the selected file
				System.out.println(file); //prints file path to console
			}
		}		
	}		
}

//Color Picker Class
public class Main {	
	public static void main (String[] args) {
		Aah color = new Aah();		
	}	
}

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aah extends JFrame implements ActionListener {	
		
	JButton button;
	JLabel label;
	Aah(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		button = new JButton("Pick a color");
		label = new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true); //this has to be true so that you can see the background color
		label.setText("this is a text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 35));
		button.addActionListener(this);
		
		this.add(button);
		this.add(label);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			label.setForeground(color); //can also do this with the background color
		}		
	}		
}
//KEY LISTENER
public class Main {	
	public static void main (String[] args) {
		new Aah();		
	}	
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Aah extends JFrame implements KeyListener {
		JLabel label;
	Aah(){
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null); // no layout manager
		this.setSize(420,420);
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		this.setVisible(true);
		this.add(label);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// invoked when a key is typed. uses a KeyChar (character), gives a character output when the corresponding key is pressed
		switch(e.getKeyChar()) {
		case 'a' : label.setLocation(label.getX()-10, label.getY()); //x and Y are co-ordinates. set location tells you where you are moving to, 10 is pixels
		break;
		case 'w' : label.setLocation(label.getX(), label.getY()-10);
		break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
		break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
		
		
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// invoked when a physical key is pressed down. it uses a keycode. returns an integer number depending on the number of the button that is pressed down
		switch(e.getKeyCode()) {
		//the numbers are for the up and down left and right 
		case 37 : label.setLocation(label.getX()-10, label.getY()); //x and Y are co-ordinates. set location tells you where you are moving to, 10 is pixels
		break;
		case 38 : label.setLocation(label.getX(), label.getY()-10);
		break;
		case 39: label.setLocation(label.getX(), label.getY()+10);
		break;
		case 40: label.setLocation(label.getX()+10, label.getY());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// called whenever a button is released
		System.out.println("you released key char: " + e.getKeyChar()); //getKeyChar tells you what button is pressed. you can use this for both upper and lower case letters
		System.out.println("you released key code: " + e.getKeyCode()); //each key has a code
	}	
}

//Mouselistener
public class Main {
	
	public static void main (String[] args) {
		new Aah();		
	}	
}

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Aah extends JFrame implements MouseListener {
		JLabel label;
		ImageIcon smile;
		ImageIcon pain;
		ImageIcon nervous;
		ImageIcon dizzy;
		
	Aah(){
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); 
		this.pack();
		this.setLocationRelativeTo(null);
		this.setSize(420,420);
		
		label = new JLabel();
		label.setBounds(0,0,100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		this.add(label);
		
		smile = new ImageIcon("src/smile.png");
		pain = new ImageIcon("src/pain.jpg");
		nervous = new ImageIcon("src/nervous.png");
		dizzy = new ImageIcon("src/dizzy.jpg");
		
		label.setIcon(smile);
		this.setVisible(true);
		
		label.addMouseListener(this);	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// when the mouse button has been clicked pressed and released over a component		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// when a mouse button has been pressed on a component
		label.setIcon(pain);		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// when a mouse button has been released over a component
		label.setIcon(dizzy);		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// when the mouse enters the area of a component
		label.setIcon(nervous);		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// when the mouse exits the area of a component
		label.setIcon(smile);		
	}	
}

//DRAG and DROP (somthing is wrong with this code and I cannot figure it out)
public class Main {	
	public static void main (String[] args) {
		new Aah();		
	}	
}

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Aah extends JFrame {
		
	JLabel label;
	ImageIcon smile;
	DiceRoller dragPanel = new DiceRoller();		
		
	Aah(){
		
		this.setTitle("Drag and Drop Demo");
		this.setVisible(true);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);				
		this.add(dragPanel);			
	}	
}

import java.awt.Point;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DiceRoller extends JPanel {
	
	ImageIcon image = new ImageIcon("src/smile.png");
	//create a width and height variable
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	DiceRoller(){
		imageCorner = new Point (0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	
	public void paintComponent(Graphics g) { //repaints image after we update the new position 
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter() { //waits until the mouse is clicked
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();

		}
	}
	
	private class DragListener extends MouseMotionAdapter() {//actually moves image as we move the mouse around
		public void mouseDragged(MouseEvent e) {
			
			Point currentPt = e.getPoint();
			
			imageCorner.translate(
					(int)(currentPt.getX() - prevPt.getX()),
					(int)(currentPt.getY() - prevPt.getY())
					);
			prevPt = currentPt;
			repaint();
		
		}		
	}
}
