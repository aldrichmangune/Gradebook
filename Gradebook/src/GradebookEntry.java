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
			System.out.println("1. Set Weights of each category");
			System.out.println("2. Add new Exam");
			System.out.println("3. Add new Homework");
			System.out.println("4. Add new Quiz");
			System.out.println("5. Set Final grade");
			System.out.println("6. Change a student's score");	
			System.out.println("7. Calculate final grade");
			System.out.println("9. Exit");
			System.out.println("Please select an option:");
			int input = sc.nextInt();
			switch(input){
			
			case 1:
				System.out.print("Enter weight of exams:");
				float examWeight = sc.nextFloat();
				test.setExamWeight(examWeight);
				System.out.print("Enter weight of homework:");
				float hwWeight = sc.nextFloat();
				System.out.print("Enter weight of quizzes:");
				float quizWeight = sc.nextFloat();
				System.out.print("Enter weight of final:");
				float finalWeight = sc.nextFloat();
				if(examWeight + hwWeight + quizWeight + finalWeight != 100){
					System.out.println("Weights do not add up to 100");
				}
				else{
					System.out.println("Exams are worth " + examWeight + "% of final grade");
					System.out.println("Homeworks are worth " + hwWeight + "% of final grade");
					System.out.println("Quizzes are worth " + quizWeight + "% of final grade");
					System.out.println("Finals are worth " + finalWeight + "% of final grade");
				}
				break;

			case 2:	
				test.addExam();		
				break;
				
			case 3:	
				test.addHW();		
				break;
				
			case 4:	
				test.addQuiz();		
				break;
				
			case 5:	
				test.setFinal();		
				break;

			case 6:
				test.editStudent();
				break;
				
			case 7:
				test.calcExamScore();
				test.calcHWScore();
				test.calcQuizScore();
				test.calcFinalGrade();
				break;

			case 9:
				sc.close();
				exit = true;
			}
		}
		while(!exit);
	}
}
