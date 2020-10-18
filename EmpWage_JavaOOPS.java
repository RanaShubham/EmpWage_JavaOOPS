package EmpWage_JavaOOPS;

import java.util.ArrayList;
import java.util.List;

interface IBM 
{
	//Constants
	final int WAGE_PER_HOUR = 30;
	final int FULL_DAY_HRS = 8;
	final int PART_TIME_HRS = 4;
	final int MAX_WORKING_DAYS = 20;
	final int MAX_WORKING_HRS = 100;
}

interface Microsoft
{
	//Constants
	final int WAGE_PER_HOUR = 50;
	final int FULL_DAY_HRS = 9;
	final int PART_TIME_HRS = 3;
	final int MAX_WORKING_DAYS = 24;
	final int MAX_WORKING_HRS = 200;
}

interface Flipkart
{
	//Constants
	final int WAGE_PER_HOUR = 15;
	final int FULL_DAY_HRS = 12;
	final int PART_TIME_HRS = 6;
	final int MAX_WORKING_DAYS = 30;
	final int MAX_WORKING_HRS = 300;
}


public class EmpWage_JavaOOPS implements IBM, Microsoft, Flipkart
{
	//constants
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	
	//Variables
	int monthlyWage;
	int workingHrs;
	int workingDays;
	int dailyWage;
	int wagePerHour;
	int fullDayHours;
	int partTimeHours;
	int maxWorkingDays;
	int maxWorkingHrs;

	//Constructor
	EmpWage_JavaOOPS(int wagePerHour, int fullDayHours, int partTimeHours, int maxWorkingDays, int maxWorkingHrs)
	{
		this.wagePerHour = wagePerHour;
		this.fullDayHours = fullDayHours;
		this.partTimeHours = partTimeHours;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}

	//To calculate monthly wage
	int calcTotalWage ()
	{		
		while (true)
		{
			int empAttendanceType = (int)Math.floor(Math.random()*10)%3;
			
			switch (empAttendanceType) 
			{
				case IS_FULL_TIME:
					this.dailyWage = this.wagePerHour * this.fullDayHours;
					this.monthlyWage = this.monthlyWage + this.dailyWage;
					this.workingHrs = this.workingHrs + this.fullDayHours;
					this.workingDays++;
					break;
				case IS_PART_TIME:
					this.dailyWage = this.wagePerHour * this.partTimeHours;
					this.monthlyWage = this.monthlyWage + this.dailyWage;
					this.workingHrs = this.workingHrs + this.partTimeHours;
					this.workingDays++;
					break;
				default:
					this.workingDays++;
			}
			
			if (this.workingHrs >= this.maxWorkingHrs || this.workingDays >= this.maxWorkingDays)
			{
				break;
			}
		}
		
		return this.monthlyWage;
	}

	//Main method
	public static void main(String[] args) 
	{
		System.out.println("Welcome to employee wage computation");
		
		EmpWage_JavaOOPS ibm = new EmpWage_JavaOOPS(IBM.WAGE_PER_HOUR, IBM.FULL_DAY_HRS, IBM.PART_TIME_HRS, IBM.MAX_WORKING_DAYS, IBM.MAX_WORKING_HRS);
		EmpWage_JavaOOPS microsoft = new EmpWage_JavaOOPS(Microsoft.WAGE_PER_HOUR, Microsoft.FULL_DAY_HRS, Microsoft.PART_TIME_HRS, Microsoft.MAX_WORKING_DAYS, Microsoft.MAX_WORKING_HRS);
		EmpWage_JavaOOPS flipkart = new EmpWage_JavaOOPS(Flipkart.WAGE_PER_HOUR, Flipkart.FULL_DAY_HRS, Flipkart.PART_TIME_HRS, Flipkart.MAX_WORKING_DAYS, Flipkart.MAX_WORKING_HRS);
	
		List<EmpWage_JavaOOPS> wageList = new ArrayList<EmpWage_JavaOOPS>();
		wageList.add(ibm);
		wageList.add(microsoft);
		wageList.add(flipkart);
		
	}
}