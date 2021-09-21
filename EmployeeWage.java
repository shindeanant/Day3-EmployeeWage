package com.eployeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int WAGE_HOURS = 20;

		int DAILY_HOURS = 8;

		int DAILY_EMP_WAGE;

		int PART_TIME_HOURS = 4;

		int PART_TIME_HOURSS = WAGE_HOURS * PART_TIME_HOURS;
		int FULL_TIME_HOURS = WAGE_HOURS * DAILY_HOURS;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is part time: " + FULL_TIME_HOURS);

		}

		else {
			System.out.println("Employee is full time :" + PART_TIME_HOURSS);
		}

	}
}
