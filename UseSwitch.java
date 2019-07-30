package basicJavaProgram;
import java.util.Scanner;
public class UseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCases3();
	}
	
	public static void exercise3(char entry) {
		
switch (entry) {
case 'A':
	System.out.println("Apple");
	break;
case 'B':
	System.out.println("Banana");
	break;
case 'C':
System.out.println("Cherries");
break;
case 'D':
System.out.println("Dragon");
break;
case 'E':
System.out.println("Elder berry");
break;
default:
System.out.println("NOt in list fruit");
break;
}
	}
	public static void testCases3() {
        //test cases for exercise 3
        exercise3('A');
        
	}
	
}

