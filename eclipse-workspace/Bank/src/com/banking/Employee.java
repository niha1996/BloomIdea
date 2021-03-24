package com.banking;

import java.io.Serializable;

public class Employee implements Serializable {
	int balance, withdraw, deposit;
	String name;

	public Employee(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public int withdrawEmp(int withdraw) {
		if (this.balance >= withdraw) {
			this.balance = this.balance - withdraw;
			return this.balance;
		} else {
			return this.balance;
		}
	}

	public int depositEmp(int deposit) {
		this.balance = this.balance + deposit;
		return this.deposit;
	}

	@Override
	public String toString() {
		return "Employee [balance=" + balance + ", name=" + name + "]";
	}

	
	}


