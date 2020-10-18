package EmpWage_JavaOOPS;

public class EmpWage_JavaOOPS 
{	
	//Constants
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HRS = 8;
	static final int PART_TIME_HRS = 4;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_WORKING_HRS = 100;
	
	//Variables
	static int monthlyWage = 0;
	static int workingHrs = 0;
	static int workingDays = 0;

	public static void main(String[] args) 
	{
		System.out.println("Welcome to employee wage computation");
		
		while (true)
		{
			int empAttendance = (int)Math.floor(Math.random()*10)%3;
			
			switch (empAttendance) 
			{
				case  1:
					calcWage(WAGE_PER_HOUR*FULL_DAY_HRS);
					workingHrs = workingHrs + FULL_DAY_HRS;
					workingDays++;
					break;
				case  2:
					calcWage(WAGE_PER_HOUR*PART_TIME_HRS);
					workingHrs = workingHrs + PART_TIME_HRS;
					workingDays++;
					break;
				default :
					workingDays++;
					calcWage(0);
			}
			
			if (workingHrs >= MAX_WORKING_HRS || workingDays >= MAX_WORKING_DAYS)
			{
				break;
			}
		}
		System.out.println("Employee wage for the whole month is: "+monthlyWage);
	}
	
	//To calculate monthly wage by adding daily salary
	private static void calcWage (int wageToday)
	{
		monthlyWage = monthlyWage + wageToday;
	}
}

