import java.util.Scanner;

/**
 * @author lordendre
 * Most epic calculator EVER!!
 */
public class Main {
	
	public static void main (String[] args) {
		
		// Input scanner
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("Calculator");
		//16	
		//17		
		//18
		// main loop
		while (run) {
			
			System.out.println("Press a number");
			System.out.println("1, Add two numbers");
			System.out.println("2, Substract two numbers");
			System.out.println("3, Multiplicate two numbers");

			System.out.println("5, exit");
			int in = scanner.nextInt();	  // asking for input

			
			// addition
			if(in==1) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the second number");
				int b = scanner.nextInt();
				System.out.println(a + "+" + b + "=" + Addition.add(a, b));
				}

			// substraction
			if(in==2) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the second number");
				int b = scanner.nextInt();
				System.out.println(a + "-" + b + "=" + Substraction.substract(a, b));
				}
			
			// multiplication
			if(in==3) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the second number");
				int b = scanner.nextInt();
				System.out.println(a + "*" + b + "=" + Multiplication.multiplicate(a, b));
				}
			
		

			// 60
			// break main loop
			if(in == 5) {
				run = false;
				break;
				}
			//66
		//67	
			
			}
		
		System.out.println("Goodbye :)");
	
		scanner.close();
		
		System.out.println("Goodbye :)");		// nice message at the end
		scanner.close();		// close input scanner
		
		}
	
	//Meme man: How many layers of irony are you on?
	//Guy: Like 5 or 6 right now my dude
	//Meme man: You're like a baby. Watch this:
	//Meme man: S U C C
	
	//////////////////////
	// End of class
	}
