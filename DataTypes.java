package basicJavaProgram;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exercise1();
		exercise2();
	}
		
	public static void exercise1() {
			
			//create int value set, it to 500
			int a=500;
			
			//create a short variable, set it to 10
			short b = 10;
			
			// create a byte variable, set it to 30
			byte c = 30;
			
			/*create a long variable, and set it to 70000 + 15 times 
			the int value, then plus short variable plus byte variable*/
			
			long d = 70000 + 15*a + b  + c;
			System.out.println("Exercise1 answer is: " +d);
			
		}
		public static void exercise2() {
		
		//convert 100 pounds into kgs
		
			// lets create pounds variable
		double pounds=100.00;
		
		//lets create kgs variable and apply logic 
		double kilograms= .454 * pounds;
	    System.out.println( "exercise2 answer is 100 pounds equals: " + kilograms + " kilograms");
		
		}

}
