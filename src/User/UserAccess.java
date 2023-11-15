package User;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class UserAccess {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char c = 0; 
		String s = null;
		Date date = new Date(); 
		Stack<String> SampleStack = new Stack<>(); 
		SampleStack.push("1) John Doe, 123 South St, Something City");
		SampleStack.push("2) Jane Doe, 1524 thisisastreet St,  MakeBelieve City");
		SampleStack.push("3) Ben Smith, 12 Stout St, Atlanta");
		SampleStack.push("4) Will Smith, 14223 Rich Pl, Westview Hills");
		SampleStack.push("5) Jorge Martinez, 421 Something Blvd, Test Town");
		
		try {
		do {
			System.out.println("Please enter Username: ");
			String user = sc.nextLine();
			System.out.println("Please enter Password: ");
			String pass = sc.nextLine();
			if(user.equals("Username") && pass.equals("Password")) {
				System.out.println("Welcome User");
				break;
		} else {
			System.out.println("Invalid Input would you like to try again? Y/N: ");
			String response = sc.nextLine();
			c = response.charAt(0);
		} if (c == 'N' || c == 'n') {
			System.out.println("Goodbye");
			System.exit(0);
		} if (!(c == 'N') && !(c=='n') && !(c=='y') && !(c=='Y') ){
			System.out.print("Invalid Response Ending Program");
			System.exit(0);
		}
		} while(c == 'y' || c == 'Y');
		} catch (Exception e) {
			System.out.println("Something went wrong...");
		}
		
		try {
		MainLoop:
		while (true) {
		System.out.print("What Would you like to access: \n 1) Calculator \n 2) Files \n 3) Stack Database \n 4) Date and Time \n 5) Exit/End Program ");
		System.out.println("\n Enter Integer: ");
		int i = sc.nextInt();
		
		switch (i) {
		case 1: {
		calculatorLoop:
		while (true) {
			System.out.println("Welcome to Calculator what would you like to do? \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Divison \n 5) Exit");
			System.out.println("Enter Integer: ");
			int a = sc.nextInt();
				switch (a) {
				case 1: {
					do {System.out.println("Enter first Integer: ");
					int a1 = sc.nextInt();
					System.out.println("Enter second Integer:");
					int a2 = sc.nextInt();
					System.out.println("Your answer is: " + (a1+a2));
					System.out.println("Would you like to add again? (Y/N): ");
					c= sc.next().charAt(0);
					if (c == 'N' || c == 'n') {
						break;
					}
					} while(c == 'y' || c == 'Y'); 
					break;
			}   case 2: {
				do { System.out.println("Enter first Integer: ");
				int a1 = sc.nextInt();
				System.out.println("Enter second Integer:");
				int a2 = sc.nextInt();
				System.out.println("Your answer is: " + (a1-a2));
				System.out.println("Would you like to subtract again? (Y/N): ");
				c= sc.next().charAt(0);
				if (c == 'N' || c == 'n') {
					break;
				} 
			} while(c == 'y' || c == 'Y');
				break;
		} case 3: {
			do { System.out.println("Enter first Integer: ");
		int a1 = sc.nextInt();
		System.out.println("Enter second Integer:");
		int a2 = sc.nextInt();
		System.out.println("Your answer is: " + (a1*a2));
		System.out.println("Would you like to multiply again? (Y/N): ");
		c= sc.next().charAt(0);
		if (c == 'N' || c == 'n') {
			break;
		} 
	} while(c == 'y' || c == 'Y');
			break;
		} case 4: {
			do { System.out.println("Enter first Integer: ");
			int a1 = sc.nextInt();
			System.out.println("Enter second Integer:");
			int a2 = sc.nextInt();
			System.out.println("Your answer is: " + (a1/a2));
			System.out.println("Would you like to divide again? (Y/N): ");
			c= sc.next().charAt(0);
			if (c == 'N' || c == 'n') {
				break;
			} 
		} while(c == 'y' || c == 'Y');
			break;
		} case 5: {
			break calculatorLoop;
		}
		} 
		} 
		} break; 
		case 2: {
			FilesLoop:
				while(true) {
					System.out.println("Welcome to Files what would you like to do? \n 1) View Files \n 2) Exit");
					System.out.println("Enter Integer: ");
					int b = sc.nextInt();
					switch(b) {
					case 1: 
						do {
							System.out.println("Here are you Files: ");
							File f = new File("."); 
							File[] files = f.listFiles();
							
							
							for (File file : files) {
								if (file.isDirectory()) {
									System.out.print("directory:");
								} else {
									System.out.print("     file:");
								}
								System.out.println(file.getCanonicalPath());
								System.out.println("Enter 1 to Exit or Any Number to loop/show the next files: ");
								i = sc.nextInt();
								if (i == 1) {
									break;
								}
							}	
						} while(i != 1);
						break;
					case 2: {
						break FilesLoop;
					}
					}
				}
		} break;
		 case 3: 
			Databaseloop:
			while(true) {
				System.out.println("Welcome to the Stack Database what would you like to do: \n 1) View Stack Data \n 2) Insert Stack Data \n 3) Delete Stack Data \n 4) Exit");
				System.out.println("Enter Integer: ");
				int d = sc.nextInt();
				sc.nextLine();
				switch(d) {
				case 1: 
					do {
						System.out.println("Your Stack Data: ");
						System.out.println(SampleStack);
						System.out.println("Enter 1 to Exit");
						i = sc.nextInt();
					} while(i != 1);
					break;
				case 2: 
					do {
					System.out.println("Enter Data (Enter 'Stop' To Exit): ");
					s =  sc.nextLine();
					  if (!s.equalsIgnoreCase("stop") && !s.equalsIgnoreCase("Stop")) {
			                SampleStack.push(s);
			                System.out.println("Data Inserted!");
			            }
					} while(!s.equalsIgnoreCase("Stop") && !s.equalsIgnoreCase("stop") );
					break;
					
				 case 3: 
					 do {
						 System.out.println("Enter '1' to delete the top of the stack and '2' to exit: ");
						 i = sc.nextInt();
						 if (i == 1) {
							 SampleStack.pop();
							 System.out.println("Top of Stack Data Deleted");
						 } if (SampleStack.isEmpty() && i == 1) do {
							 System.out.println("There is no data in the stack add more data and exit with '2': ");
							 i = sc.nextInt(); 
						 } while( i != 2 );
					 } while( i != 2 );
					 break;
				 case 4:
				 {
					 break Databaseloop;
				 }
				}
			} break; 
			
		 case 4: 
			 do {
				 System.out.println("Today's Date and current time: " + date.toString() + "\nEnter 1 to Exit: "  );
				 i = sc.nextInt();
			 } while( i != 1);
			break;
			
		case 5: 
			System.out.println("Goodbye");
			System.exit(0);
			}
	}
		} catch (Exception e) {
			System.out.println("Something went wrong...");
		}
}
}