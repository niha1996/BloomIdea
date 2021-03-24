package marks;

public class CheckingMarks {

	int marks;

	/*
	 * public CheckingMarks(int marks) { this.marks = marks; }
	 */

	public void checkmarks(int marks) throws MarksException {
		if (marks > 100 || marks < 0) {
			throw new MarksException(marks);
		} else {
			System.out.println("In range");
		}

	}
}
