package teacher_Demo;

/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 10 Sample Program: Compute the annual average rain fall
                                and the variation from monthly average.
                                Use month name as a prompt for
                                inputting monthly average values.

    File: Ch10Rainfall2.java
*/

import java.util.*;

class Ch10Rainfall2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		int[] array = {3,6,8,10};
		

//		String[] monthName1 = new String[12];
//		monthName[0] = "January";
//		monthName[1] = "Febuary";
//		monthName[2] = "March";
//		monthName[3] = "April";
//		//...
//		monthName[11] = "December";
		
		double[] rainfall = new double[12];
		double annualAverage, sum = 0.0;

		for (int i = 0; i < rainfall.length; i++) {
			System.out.print("Rainfall for " + monthName[i] + ": ");
			rainfall[i] = scanner.nextDouble();
			sum += rainfall[i];
		}

		annualAverage = sum / rainfall.length;

		System.out.println("Annual Average Rainfall:" + annualAverage);
	}
}