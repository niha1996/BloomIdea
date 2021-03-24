package marks;

import java.util.Scanner;

public class Marks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		{
			int marks;
			marks = sc.nextInt();
			CheckingMarks m = new CheckingMarks();
			try {

				m.checkmarks(marks);

			} catch (MarksException e) {
				System.out.println("Invalid Marks=" + e.getMarks());
			}
		}
	}
}
	


