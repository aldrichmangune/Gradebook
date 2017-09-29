import java.io.IOException;
import java.util.Scanner;

public class GradebookEntry{


	public static void main(String[] args) throws IOException{
		Gradebook test = new Gradebook();
		boolean exit = false;
		test.readStudents();
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n       Gradebook Menu");
			System.out.println("---------------------------");
			System.out.println("1. Enrique Bad?");
			System.out.println("2. Enrique Bad?");
			System.out.println("3. Enrique Bad?");
			System.out.println("4. Enrique Bad?");
			System.out.println("5. Enrique Bad?");
			System.out.println("6. Enrique Bad?");	
			System.out.println("7. Enrique Bad?");
			System.out.println("9. Exit");
			System.out.println("Please select an option:");
			int input = sc.nextInt();
			switch(input){
			
			case 1:
				boolean bad = true;
				while(bad){
				System.out.println("Enrique Bad");
				}
				break;

			case 2:	
				System.out.println("Enrique Bad");	
				break;
				
			case 3:	
				System.out.println("Enrique Bad");		
				break;
				
			case 4:	
				System.out.println("Enrique Bad");	
				break;
				
			case 5:	
				System.out.println("Enrique Bad");		
				break;

			case 6:
				System.out.println("Enrique Bad");
				break;
				
			case 7:
				System.out.println("Enrique Bad");
				break;

			case 9:
				sc.close();
				exit = true;
			}
		}
		while(!exit);
	}
}
