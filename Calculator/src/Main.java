import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("Calculator");
		
		//Meme man: How many layers of irony are you on?
		
		while (run) {
			
			System.out.println("Press a number");
			System.out.println("1, Add two numbers");
			System.out.println("2, Substract two numbers");
			System.out.println("3, Multiplicate two numbers");

			System.out.println("5, exit");
			int in = scanner.nextInt();	

			//Guy: Like 5 or 6 right now my dude
			
			if(in==1) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the second number");
				int b = scanner.nextInt();
				System.out.println(a + "+" + b + "=" + Addition.add(a, b));
				}

			
			if(in==2) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the second number");
				int b = scanner.nextInt();
				System.out.println(a + "-" + b + "=" + Substraction.substract(a, b));
				}
			

			if(in==3) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the second number");
				int b = scanner.nextInt();
				System.out.println(a + "*" + b + "=" + Multiplication.multiplicate(a, b));
				}
			

			//Meme man: You're like a baby. Watch this:
		

			
			
			if(in == 5) {
				run = false;
				break;
				}
			
			
			
			}
		
			//Meme man: S U C C
		System.out.println("Goodbye :)");
	
		scanner.close();
		
		}
	

	}
