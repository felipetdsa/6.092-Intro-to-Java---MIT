/*
 * Code made using the examples of Lecture 4
 * Oriented Object Programing
 *
 * Creating a Class, Fields, Methods, Constructor, Calling Methods, etc.
 * Static and Instance Methods
 * References
 *
 * By felipetdsa@gmail.com
 */

package Lecture4;

public class baby {
	String name;
	double weight;
	boolean isMale;
	int numPoops = 0;
	baby[] siblings;
	static int numBabiesMade = 0;

	baby(String myname, boolean maleBaby, double myweight) {
		// TODO Auto-generated constructor stub
		name = myname;
		isMale = maleBaby;
		weight = myweight;
		numBabiesMade += 1;
	}

	void poop() {
		numPoops += 1;
		System.out
				.println("Dear mother, " + "I have pooped. Ready the diaper.");
	}

	void sayHi() {
		System.out.println("Hi, my name is.. " + name);
	}

	void eat(double foodWeight) {
		if (foodWeight >= 0 && foodWeight < weight) {
			weight = weight + foodWeight;
			System.out.println(name + " new weight: " + weight);
		}
		// double eat(double foodWeight) { // Double method works ;)
		// if (foodWeight >= 0 && foodWeight < weight) {
		// weight = weight + foodWeight;
		//
		// }
		// return weight;

	}
	
	void cry(){
		System.out.println(name + " cries");
	}
	static void cry2(baby myname){
		System.out.println(myname.name + " cries 2");
	}

	public static void main(String[] args) {
		baby.numBabiesMade = 100; // Must be static to access it
		baby shiloh = new baby("Shiloh Jolie-Pitt", true, 3.8);
//		System.out.println("------------"+baby.numBabiesMade);
		baby knox = new baby("Knox Jolie-Pitt", true, 4.2);
//		System.out.println("------------"+baby.numBabiesMade);
		baby felipe = new baby("Felipe", true, 4.5);
		System.out.println(shiloh.name);
		shiloh.numPoops = 10;
		System.out.println(shiloh.numPoops);
		shiloh.sayHi();
		knox.sayHi();
		felipe.sayHi();
		// System.out.println(shiloh.eat(1)); // use when method eat is double
		shiloh.eat(1);
		knox.eat(2);
		knox.poop();
		System.out.println(knox.weight);
//		System.out.println(shiloh.numBabiesMade);
//		System.out.println(knox.numBabiesMade);
//		System.out.println(felipe.numBabiesMade);
		System.out.println("Babies Made "+baby.numBabiesMade);
		felipe.cry();
		cry2(felipe);
		cry2(knox);
//		baby.numBabiesMade = 2;
//		System.out.println(felipe.numBabiesMade);
		

	}
}
