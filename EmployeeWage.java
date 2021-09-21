package com.eployeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int empHr;

		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		System.out.println("Random Integers: " + empCheck);

		switch (empCheck) {
		case 1:
			empHr = 8;
			System.out.print("full time");
			break;
		case 2:
			empHr = 4;
			System.out.print("part time");
			break;
		case 0:
			empHr = 0;
			System.out.println("absent");
			break;

		default:
			empHr = 0;
			break;
		}

	}
}
