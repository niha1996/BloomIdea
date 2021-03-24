package com.banking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String name;
		int balance, withdraw, deposit,ch;
		System.out.print("Enter Name:");
		name = sc.next();
		System.out.print("Enter Balance:");
		balance = sc.nextInt();
		Employee e = new Employee(balance, name);
		
		
		do {
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Exit");
			
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Withdraw Amount");
				withdraw = sc.nextInt();
				e.withdrawEmp(withdraw);
				break;
			case 2:
				System.out.println("Deposit Amount");
				deposit = sc.nextInt();
				e.depositEmp(deposit);
				break;
			case 3:
				System.out.println("Exit");
				break;
			}
		} while (ch!=3);
		
		FileOutputStream fos=new FileOutputStream("write.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("Object Written Successfully");
		FileInputStream fis=new FileInputStream("write.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee)ois.readObject();
		e1.toString();
		ois.close();
        
	}
}
