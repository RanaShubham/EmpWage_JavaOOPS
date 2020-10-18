package EmpWage_JavaOOPS;

public class EmpWage_JavaOOPS {
	
	//Constants
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HRS=8;

	public static void main(String[] args) 
	{
		System.out.println("Welcome to employee wage computation");
		int empAttendance = (int)Math.floor(Math.random()*10)%2;
		
		if (empAttendance == 1)
		{
			System.out.println("Daily wage for today is: "+WAGE_PER_HOUR*FULL_DAY_HRS);
		}
	}

}
