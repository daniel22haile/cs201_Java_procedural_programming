package teacher_Demo;

public class GrowableString {

	public static void main(String[] args) {
		String first = "Donald";
		String middle = "John";
		String last = "Trump";

		//System.out.println(first + " " + middle + " " + last);
		StringBuffer full = new StringBuffer(first);
		full.reverse();
		full.append(" ");
		full.append(middle);
		full.append(" ");
		full.append(last);
		System.out.println(full);
	}
}
