package teacher_Demo;

/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 10 Sample Program: Compute the annual average rain fall
                                and the variation from monthly average.

    File: Ch10Rainfall.java
*/

import java.util.*;

class Ch10Rainfall {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[] rainfall = new double[12];
		double annualAverage, sum = 0.0;

		for (int i = 0; i < rainfall.length; i++) { //i represents the index
			System.out.print("Rainfall for month " + (i+1) + ": ");
			rainfall[i] = scanner.nextDouble();
			sum += rainfall[i];
		}
		//rainfall  sum
		annualAverage = sum / rainfall.length;
		System.out.println("Annual Average Rainfall:" + annualAverage);
	}
}