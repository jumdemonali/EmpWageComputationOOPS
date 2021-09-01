package com.bl.empwageoops;

public class EmpWageBuilder {
    public static final int RATE_PER_HR = 20;
    static final int IS_FULL_TIME = 1;
    static  final int IS_PART_TIME = 2;
    public void employeeWage() {
        System.out.println("Welcome to Employee Wage Computation Program!!");
        int empHrs = 0, totalEmpHrs = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
            default:
                empHrs = 0;
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
