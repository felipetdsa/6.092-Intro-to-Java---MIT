/*
 *Assignment 3
 *
 *Find the best and second best times.
 *Print the best and second best names and index.
 *
 *By felipetdsa@gmail.com
 * PS: I will make another version of program called Marathon2.java
 *        to try others methods.
 */


class Marathon {
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		int bestTime = 0;
		int secondBest = 0;
		int diff = 0;

		for (int i = 0; i < names.length; i++) {
			if (times[i] < times[bestTime]) {
				bestTime = i;
			}
		}
		for (int i = 0; i < names.length; i++){
			if (i == bestTime){
				i++;				
			}else if (i == 0){
				diff = times[i] - times[bestTime];
			}
			if (times[i] - times[bestTime] < diff){
				diff = times[i] - times[bestTime];
				secondBest = i;
			}
		}
		System.out.println("Best Time is " + names[bestTime] + ": " + times[bestTime]);
		System.out.println("Index: " + bestTime);
		System.out.println("Second Best is " + names[secondBest] + ": " + times[secondBest]);
		System.out.println("Index: " + secondBest);
	}
}
