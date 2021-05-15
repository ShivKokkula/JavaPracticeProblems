package EmpWageBuilderUC2;

public class EmpWageBuilderUC2 {
	
	//Constants
	static int IS_FULL_TIME = 1;
	static int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == IS_FULL_TIME) {
			
			empHrs = 8;
		}
		
		
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employ Wage: " +empWage);
	}

}
