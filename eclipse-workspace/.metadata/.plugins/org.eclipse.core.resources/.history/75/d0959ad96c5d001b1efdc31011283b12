import java.util.Scanner;
public class Cube {
	int side;

	Cube(int side) {
		this.side = side;
	}

	void area() {
		int area = 6 * side * side;
		System.out.println("Area=" + area);
	}

	void volume() {
		int volume = side * side * side;
		System.out.println("Volume=" + volume);
	}

	public static void main(String args[])
	{ 
		String cont;
		do
	  {
			
			
	    Scanner sc=new Scanner(System.in);
		int side,choice;
		System.out.println("Enter side");
		side=sc.nextInt();
		Cube cube=new Cube(side);
		
		System.out.println("Enter choice");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("1.Area");
		System.out.println("2.Volume");
		System.out.println("3.Exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: cube.area();
		        break;
		case 2:cube.volume();
		        break;
		case 3:System.exit(1);
		       break;
		default:System.out.println("Invalid input");
		       break;
		}
		System.out.println("Enter y to continue");
		cont=sc.next();
	  }
		while(cont.equals("y"));
	}
}
