package EmpWage_JavaOOPS;

public class EmpWage_JavaOOPS 
{	
	//Constants
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HRS = 8;
	static final int PART_TIME_HRS = 4;
	
	//Variables
	static int monthlyWage = 0;

	public static void main(String[] args) 
	{
		System.out.println("Welcome to employee wage computation");
		
		for (int i=0; i<20; i++)
		{
			int empAttendance = (int)Math.floor(Math.random()*10)%3;
			
			switch (empAttendance) 
			{
				case  1:
					calcWage(WAGE_PER_HOUR*FULL_DAY_HRS);
					break;
				case  2:
					calcWage(WAGE_PER_HOUR*PART_TIME_HRS);
					break;
				default :
					calcWage(0);
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

