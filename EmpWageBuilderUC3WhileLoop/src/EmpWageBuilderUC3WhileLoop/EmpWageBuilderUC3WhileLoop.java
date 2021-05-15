package EmpWageBuilderUC3WhileLoop;

public class EmpWageBuilderUC3WhileLoop {

	//Constants
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 2;
		public static final int MAX_HOURS_IN_MONTH = 20;
		
		public static void main(String[] args) {
			//Variables
			int empHrs = 0;
			int empWage = 0;
			int totalEmpWage = 0;
			int totalEmpHours = 0;
			int totalWorkingDays = 0;
			
			while (totalEmpHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
				totalWorkingDays++;
				int empCheck = (int)Math.floor(Math.random() * 10) % 3;
				
				switch(empCheck) {
					case IS_FULL_TIME: 
						empHrs = 8;
						break;
					case IS_PART_TIME:
						empHrs = 4;
						break;
					default:
						empHrs = 0;
						break;
					}
				totalEmpHours = totalEmpHours + empHrs;
				empWage = empHrs * EMP_RATE_PER_HOUR;
				totalEmpWage = totalEmpWage + empWage;
				System.out.println("Emp Wage" + empWage);
			}
			
			System.out.println("Employ Wage: " +totalEmpWage);
		}

	
}
