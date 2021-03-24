import java.util.Scanner;
public class Static {
    static int a;
	void setValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value Of A:");
		a=sc.nextInt();
	}
	void printValue()
	{
		System.out.println("A : "+a);
	}
	public static void main(String[] args) {
		Static s1=new Static();
		Static s2=new Static();
		Static s3=new Static();
		
		s1.setValue();
		s2.setValue();
		s3.setValue();
		
		s1.printValue();
		s2.printValue();
		s3.printValue();
		
	}
}
