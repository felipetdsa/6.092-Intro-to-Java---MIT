/*
 * fooCorporation
 * Program to calculate how much to pay their hourly employees
 * State of MA  requires that hourly employees be paid at least $8.00 an hour
 * If employee work more than 40 hours a week, overtime hours will be payed at 1.5 times their base pay
 * Foo Corp requires that an employee not work more than 60 hours in a week. 
 */


public class FooCorporation {
	public static String paym(int hw, double sal){
		if (hw > 60){
			return ("can't work more than 60 hours/week");
		}else if (sal < 8.00){
			return ("can't pay less than $8.00/hour");
		}else if (hw > 40){
			return ("$" + String.valueOf(sal*40 + (hw-40)*(1.5 * sal)));
		}
		return null;
	}
	public static void main(String[] arguments){
		System.out.println("Employee 1: " + paym(35, 7.50));
		System.out.println("Employee 2: " + paym(47, 8.20));
		System.out.println("Employee 3: " + paym(73, 10.00));
	}
}
