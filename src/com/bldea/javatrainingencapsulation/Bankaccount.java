package com.bldea.javatrainingencapsulation;
public class Bankaccount {
	private int accno =111;
	private int pin = 842;
	private int balance=3000;
	private String name = "darshan";


	void setdata(int accno,int pin,int balance,String name)
	{
		this.accno=accno;
		this.pin=pin;
		this.balance=balance;
		this.name=name;
	}
	void getdata()
	{
		System.out.println(accno);
		System.out.println(pin);
		System.out.println(balance);
		System.out.println(name);
	}
}
class AccessAcc
{
	public static void main(String[] args) {
		Bankaccount ba =new Bankaccount();
ba.setdata(222, 333, 4400, "vivek");
ba.getdata();
	}
}


