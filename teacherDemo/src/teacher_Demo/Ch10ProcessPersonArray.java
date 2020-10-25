package teacher_Demo;
/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 10 Sample Program: Illustrate the processing
                               of an array of Person objects

    File: Ch10ProcessPersonArray.java
*/

import java.util.*;

class Ch10ProcessPersonArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Person[] person = null; // declare the person array
		person = new Person[2]; // and then create it

		String name, inpStr;
		int age;
		char gender;
		for (int i = 0; i < person.length; i++) {
			// read in data values
			System.out.print("Enter name: ");
			name = scanner.next();
			System.out.print("Enter age: ");
			age = scanner.nextInt();
			System.out.print("Enter gender: ");
			inpStr = scanner.next();
			gender = inpStr.charAt(0);
			// create a new Person and store in the array
			person[i] = new Person(name, age, gender);
		}
		
		System.out.println("Now we are printing the array");
		for(int i = 0; i < person.length; i++) {
			Person p = person[i]; 
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getGender());
		}
		

		// -------------- Compute Average Age --------------//

		float sum = 0, averageAge;

		for (int i = 0; i < person.length; i++) {

			Person p = person[i];
			sum += p.getAge();
		}

		averageAge = sum / person.length;

		System.out.println("Average age: " + averageAge);
		System.out.println("\n");

		// ------ Find the youngest person ----------//		
//		int		minIdx = 0;		//index to the youngest person
//		int     maxIdx = 0;
//		for (int i = 1; i < person.length; i++) {
//			if ( person[i].getAge() < person[minIdx].getAge() ) {
//				minIdx = i; 	//found a younger person
//		    } 
//			if(person[i].getAge() > person[maxIdx].getAge()) {
//				maxIdx = i;
//			}
//		}
		
		int	minAge = person[0].getAge();		//index to the youngest person
		int index  = 0;
		for (int i = 1; i < person.length; i++) {
			if ( person[i].getAge() < minAge ) {
				minAge = person[i].getAge(); 	//found a younger person
				index = i;
		    } 
		}
		
		System.out.println("Youngest: is " + minAge + " years old." );
		System.out.println("Youngest is in this postion of the array: " + index );
//
		// ----------- Search for a particular person ------------//

		System.out.print("Name to search: ");
		String searchName = scanner.next();
		int i = 0;
		while (i < person.length && !person[i].getName().equals(searchName)) {
			i++;
		}
		//i is in [0,length-1] if searchName exists in the array
		//i is length if searchName does not exist in the array
		if (i == person.length) {
			// not found - unsuccessful search
			System.out.println(searchName + " was not in the array");
		} else {
			// found - successful search
			//delete the person
			person[i] = null;
			System.out.println("Found " + searchName + " at position " + i);
			for ( i = 0; i < person.length; i++) {
				person[i] != null
						System.out.println(person[i]);
			}
		}
		
	}
}