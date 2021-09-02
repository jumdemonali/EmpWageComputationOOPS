package com.bl.empwageoops;

public class EmpWageBuilder {
    int wagePerHrs=20;
    int dailyWage;
    int workHrs=0;
    int totalempWage =0;
    public static void main(String[] args) {
        for(int day=1;day<=20;day++) {
            int randomCheck = (int) (Math.floor(Math.random()*10)%3);
            EmpWageBuilder obj=new EmpWageBuilder();
            obj.wageCal(randomCheck);
        }
    }

    public void wageCal(int randomCheck) {
        int dailyWage = 0;

        switch (randomCheck) {
            case 1: {
                workHrs = 4;
                break;
            }
            case 2: {
                workHrs = 8;
                break;
            }
            default: {

                workHrs = 0;
            }
        }
            dailyWage = wagePerHrs * workHrs;
            System.out.println("DailySalary:" + dailyWage);

        }

}