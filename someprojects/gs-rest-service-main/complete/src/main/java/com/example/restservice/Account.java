package com.example.restservice;

public class Account {
	
	//this is  model
	
	private int acno, balance, pin;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Account(int acno, int balance, int pin) {
		super();
		this.acno = acno;
		this.balance = balance;
		this.pin = pin;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
