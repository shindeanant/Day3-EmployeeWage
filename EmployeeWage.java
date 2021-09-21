package com.eployeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int DAYS_PER_MONTH = 20;
		int WAGE_HOURS = 20;
		int DAILY_HOURS = 8;

		int DAILY_WAGES = WAGE_HOURS * DAILY_HOURS;

		System.out.println("Employee daily wage is :" + DAILY_WAGES);

		int Monthly_Wage = DAILY_WAGES * DAYS_PER_MONTH;

		System.out.println("Monthly wage of employee is:" + Monthly_Wage);

	}
}
