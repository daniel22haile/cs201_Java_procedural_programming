package teacher_Demo;

public class Table {

	public static void main(String[] args) {
		for(int row=11; row<=20; row++) {
			for(int col = 5; col <=25; col+=5) {
				int value = 19*col*row;
				System.out.print(value);
				System.out.print("  ");								
			}
			System.out.println();
		}
	}
}
