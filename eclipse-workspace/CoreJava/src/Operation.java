import java.util.Scanner;
public class Operation {
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int a,b,c,d;
    String e;
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	
	do
	{
     System.out.println("Enter choice");
	 c=sc.nextInt();
	switch(c)
	{
	case 1:System.out.println("Addition of two numbers");
	       d=a+b;
	       System.out.println("Sum =" + d);
	       break;
	case 2:System.out.println("Subtraction of two numbers");
           d=a-b;
           System.out.println("Diff =" + d);
           break;
	case 3:System.out.println("Multiplication of two numbers");
           d=a*b;
           System.out.println("Prod =" + d);
           break;
    case 4:System.out.println("Division of two numbers");
           d=a/b;
           System.out.println("Div =" + d);
           break;
    case 5:System.exit(1);
           break;
    default:System.out.println("Invalid Case");
            break;
	}
	System.out.println("Continue y/n");
	e=sc.next();
	}
	while(e.equals("y"));
}
}
