package com.bl.empwageoops;

public class EmpWageBuilder {
    public static final int RATE_PER_HR = 20;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!!");
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        EmpWageBuilder emp = new EmpWageBuilder();
        emp.employeeWage(empCheck);
    }

    public void employeeWage(int empCheck) {
        int empHrs = 0, totalEmpHrs = 0, totalEmpWage = 0, empWage = 0;
        switch (empCheck) {
            case IS_FULL_TIME: {
                empHrs = 8;
                empWage = empHrs * RATE_PER_HR;
                break;
            }
            case IS_PART_TIME: {
                empHrs = 4;
                empWage = empHrs * RATE_PER_HR;
                break;
            }
            default: {
                empHrs = 0;
            }
        }
    }
    }


