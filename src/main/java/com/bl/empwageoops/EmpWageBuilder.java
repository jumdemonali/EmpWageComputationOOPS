package com.bl.empwageoops;

public class EmpWageBuilder {
<<<<<<< Updated upstream

        static final int WAGE_PER_HR = 20;
        static final int FULL_DAY_HR = 8;
        static final int PART_TIME_HR = 4;
        static final int MAX_WORKING_DAYS = 20;
        static final int MAX_HRS_PER_MONTH = 100;
        static final int IS_FULL_TIME = 0;
        static final int IS_PART_TIME = 1;

        public void employeeWage() {
            System.out.println("Welcome to Employee Wage Builder Program!!");
            int totWage = 0;
            int totalWorkingHrs = 0;
            int totalWorkingDays = 0;
            int empHrs = 0;

            while (totalWorkingHrs < MAX_HRS_PER_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
                totalWorkingDays++;
                double empCheck = (Math.floor(Math.random() * 10) % 3);
                switch ((int) empCheck) {
                    case IS_FULL_TIME:
                        System.out.println("Employee is present full time");
                        empHrs = FULL_DAY_HR;
                        break;
                    case IS_PART_TIME:
                        System.out.println("Employee is present part time");
                        empHrs = PART_TIME_HR;
                        break;
                    default:
                        System.out.println("Employee is absent");
                        empHrs = 0;
                }
                totalWorkingHrs += empHrs;
            }
            totWage = totalWorkingHrs * WAGE_PER_HR;
            System.out.println("Total working hours: " +totalWorkingHrs);
            System.out.println("Total working Days: " +totalWorkingDays);
            System.out.println("Total Wage is " +totWage);
        }
=======
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 30;
    public static final int MAX_HRS_IN_MONTH=10;
    public void employeeWage() {
        int empHrs = 0;
        int totalEmpHrs=0;
        int totalWorkingHrs = 0;
        while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingHrs<NUM_OF_WORKING_DAYS) {
            totalWorkingHrs++;
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            if (empCheck == IS_FULL_TIME)
                empHrs = 8;
            else if (empCheck == IS_PART_TIME)
                empHrs = 4;
            else
                empHrs = 0;

            totalEmpHrs+=empHrs;
            System.out.println("Day: "+totalWorkingHrs+"Emp Hr:" + empHrs);
        }
        int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
        System.out.println("Total Emp Wage is " + totalEmpWage);
    }
>>>>>>> Stashed changes

        public static void main(String[] args) {
            EmpWageBuilder emp = new EmpWageBuilder();
            emp.employeeWage();
        }
    }