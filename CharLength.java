package lab_2;

import java.util.Scanner;

public class CharLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word :");
		String myChar = scan.nextLine();
		int Size = myChar.length();
		//System.out.println(Size);
		
		String myInitial = Size + "\n" + myChar.substring(0,1) + "\n" + myChar.substring(myChar.length()-1);
		System.out.println(myInitial);

	}

}
