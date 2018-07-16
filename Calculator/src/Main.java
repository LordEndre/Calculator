import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("Calculator");
		
		
		while (run) {
			
			System.out.println("Press a number");
			System.out.println("1, Add two numbers");
			System.out.println("5, exit");
			int in = scanner.nextInt();	
			
			if(in==1) {
				System.out.println("Enter the first number");
				int a = scanner.nextInt();
				System.out.println("Enter the first number");
				int b = scanner.nextInt();
				System.out.println(a + "+" + b + "=" + Addition.add(a, b));
				}
			
			
			
			
			if(in == 5) {
				run = false;
				break;
				}
			
			
			
			}
		
		
		System.out.println("Goodbye :)");
	
		scanner.close();
		
		}
	

	}
