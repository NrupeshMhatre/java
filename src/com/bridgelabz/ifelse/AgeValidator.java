package com.bridgelabz.ifelse;

import java.util.Scanner;

public class AgeValidator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your age: ");
		int Age=sc.nextInt();
		if(Age>=18)
		{
			System.out.print("Candidate can applied for Drivring licence");
		}
		else
		{
			System.out.print("Candidate should complete 18 years");
		}

	}

}
