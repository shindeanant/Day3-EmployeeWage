package com.eployeewage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int Total_hurs = 100;
		int Total_days = 20;
		int wage_hurs = 20;
		int daily_hurs = 8;

		int empHr;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		while (totalEmpHrs <= Total_hurs && totalWorkingDays < Total_days) {

			totalWorkingDays++;

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

			empWage = empHr * wage_hurs;

			totalEmpWage = totalEmpWage + empWage;
			System.out.println("days" + totalWorkingDays + "emphrs" + empHr);
			System.out.println("wage" + totalEmpWage);
			System.out.println("total wage" + totalEmpWage);

		}

	}
}
