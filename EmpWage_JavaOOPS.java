package EmpWage_JavaOOPS;

interface IBM 
{
	//Constants
	static final int WAGE_PER_HOUR = 30;
	static final int FULL_DAY_HRS = 8;
	static final int PART_TIME_HRS = 4;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_WORKING_HRS = 100;
}

interface Microsoft
{
	//Constants
	static final int WAGE_PER_HOUR = 50;
	static final int FULL_DAY_HRS = 9;
	static final int PART_TIME_HRS = 3;
	static final int MAX_WORKING_DAYS = 24;
	static final int MAX_WORKING_HRS = 200;
}

interface Flipkart
{
	//Constants
	static final int WAGE_PER_HOUR = 15;
	static final int FULL_DAY_HRS = 12;
	static final int PART_TIME_HRS = 6;
	static final int MAX_WORKING_DAYS = 30;
	static final int MAX_WORKING_HRS = 300;
}


public class EmpWage_JavaOOPS implements IBM, Microsoft, Flipkart
{
	//constants
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int IS_ABSENT = 0;
	
	//Variables
	int monthlyWage = 0;
	int workingHrs = 0;
	int workingDays = 0;
	int dailyWage = 0;

	public static void main(String[] args) 
	{
		System.out.println("Welcome to employee wage computation");
		System.out.println("Monthly wage for IBM employee is: "+ calcWage(IBM.FULL_DAY_HRS,IBM.MAX_WORKING_DAYS,IBM.MAX_WORKING_HRS,IBM.PART_TIME_HRS,IBM.WAGE_PER_HOUR));
		System.out.println("Monthly wage for Microsoft employee is: "+ calcWage(Microsoft.FULL_DAY_HRS,Microsoft.MAX_WORKING_DAYS,Microsoft.MAX_WORKING_HRS,Microsoft.PART_TIME_HRS,Microsoft.WAGE_PER_HOUR));
		System.out.println("Monthly wage for Flipkart employee is: "+ calcWage(Flipkart.FULL_DAY_HRS,Flipkart.MAX_WORKING_DAYS,Flipkart.MAX_WORKING_HRS,Flipkart.PART_TIME_HRS,Flipkart.WAGE_PER_HOUR));

	}
	
	//To calculate monthly wage
	private static int calcWage (int fullTimeHrs, int maxDays, int maxHrs, int partTimeHrs, int wagePerHr)
	{
		EmpWage_JavaOOPS obj = new EmpWage_JavaOOPS();
		
		while (true)
		{
			int empAttendanceType = (int)Math.floor(Math.random()*10)%3;
			
			switch (empAttendanceType) 
			{
				case IS_FULL_TIME:
					obj.dailyWage = wagePerHr * fullTimeHrs;
					obj.monthlyWage = obj.monthlyWage + obj.dailyWage;
					obj.workingHrs = obj.workingHrs + fullTimeHrs;
					obj.workingDays++;
					break;
				case IS_PART_TIME:
					obj.dailyWage = wagePerHr * partTimeHrs;
					obj.monthlyWage = obj.monthlyWage + obj.dailyWage;
					obj.workingHrs = obj.workingHrs + partTimeHrs;
					obj.workingDays++;
					break;
				case IS_ABSENT:
					obj.workingDays++;
			}
			
			if (obj.workingHrs >= maxHrs || obj.workingDays >= maxDays)
			{
				break;
			}
		}
		
		return obj.monthlyWage;
	}
}

