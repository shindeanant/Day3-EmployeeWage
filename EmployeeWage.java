package com.eployeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		double empCheck = Math.floor(Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
		}

		else {
			System.out.println("Employee is Absent");

		}

	}
}
