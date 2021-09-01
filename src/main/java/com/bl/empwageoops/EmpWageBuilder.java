package com.bl.empwageoops;

public class EmpWageBuilder {
    public static final int RATE_PER_HR = 20;
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    public void employeeWage() {
        System.out.println("Welcome to Employee Wage Computation Program!!");
        int empHrs = 0, totalEmpHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present full time");
            totalEmpHrs = 8;
        } else if (empCheck == IS_PART_TIME)
        {
            System.out.println("Employee is Present part time");
            totalEmpHrs = 4;
        }
        else {
            System.out.println("Employee is Absent");
            totalEmpHrs = 0;
        }
        totalEmpHrs += empHrs;
        int totalEmpWage = totalEmpHrs * RATE_PER_HR;
        System.out.println("Total emp wage is: " + totalEmpWage);
    }

    public static void main(String[] args) {
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.employeeWage();
    }
}
