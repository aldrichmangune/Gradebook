import java.util.ArrayList;
import java.util.List;

public class Student {


	private List<Exam> exams;
	private List<Homework> homeworks;
	private List<Quiz> quizzes;
	private float examGrade;
	private float hwGrade;
	private float quizGrade;
	private float finalGrade;
	private float classGrade;
	private String grade;
	private Final Final;
	private String firstName;
	private String lastName;
	private int studentID;




	public Student(String first, String last, int ID)
	{
		this.firstName = first;
		this.lastName = last;
		this.studentID = ID;
		exams = new ArrayList<Exam>();
		homeworks = new ArrayList<Homework>();
		quizzes = new ArrayList<Quiz>();
		examGrade = 1;
		hwGrade = 1;
		quizGrade = 1;
		finalGrade = 1;
	}

	public void addExam(float score, float grade)
	{
		Exam toAdd = new Exam(score, grade);
		exams.add(toAdd);
	}

	public void addHW(float score, float grade)
	{
		Homework toAdd = new Homework(score, grade);
		homeworks.add(toAdd);
	}
	
	public void addQuiz(float score, float grade)
	{
		Quiz toAdd = new Quiz(score, grade);
		quizzes.add(toAdd);
	}
	
	public void setFinal(float score, float grade)
	{
		Final = new Final(score, grade);
	}
	
	public 
	
	public void showExams(){
		int i = 1;
		for(Exam exam: exams){
			System.out.println("Exam " + i + ": " + exam.score + " out of " + exam.grade);
			i++;
		}
	}
	
	public void showHomeworks(){
		int i = 1;
		for(Homework hw: homeworks){
			System.out.println("Homework " + i + ": " + hw.score + " out of " + hw.grade);
			i++;
		}
	}
	
	public void showQuizzes(){
		int i = 1;
		for(Quiz q: quizzes){
			System.out.println("Quiz " + i + ": " + q.score + " out of " + q.grade);
			i++;
		}
	}
	
	public void showFinal(){
		System.out.println("Final : " + Final.score + " out of " + Final.grade);
	}
	
	public List<Exam> getExams(){
		return exams;
	}
	
	public List<Homework> getHomeworks(){
		return homeworks;
	}
	
	public List<Quiz> getQuizzes(){
		return quizzes;
	}
	
	public void setExamGrade(float newGrade){
		this.examGrade = newGrade;
	}
	
	public float getExamGrade(){
		return examGrade;
	}
	
	public void setHWGrade(float grade){
		this.hwGrade = grade;
	}
	
	public float getHWGrade(){
		return hwGrade;
	}
	
	public void setQuizGrade(float grade){
		this.quizGrade = grade;
	}
	
	public float getQuizGrade(){
		return quizGrade;
	}	
	
	public void setFinalGrade(float grade){
		this.finalGrade = grade;
	}
	
	public float getFinalGrade(){
		return finalGrade;
	}	
	
	public void setGrade(String grade){
		this.grade = grade;
	}
	
	
	public void setClassGrade(float grade){
		this.classGrade = grade;
	}
	
	public String getGrade(){
		return grade;
	}
	
	public void changeExamScore(int examNum, float score){
		exams.get(examNum).setScore(score);
	}

	public void changeHWScore(int hwNum, float score){
		homeworks.get(hwNum).setScore(score);
	}
	
	public void changeQuizScore(int quizNum, float score){
		quizzes.get(quizNum).setScore(score);
	}
	
	public void changeFinalScore(float score){
		Final.setScore(score);
	}
	
	public boolean hasExam(){
		if(exams != null){
			return true;
		}
		return false;
	}
	
	public boolean hasQuiz(){
		if(quizzes != null){
			return true;
		}
		return false;
	}
	
	public boolean hasHW(){
		if(homeworks != null){
			return true;
		}
		return false;
	}
	
	public boolean hasFinal(){
		if(Final != null){
			return true;
		}
		return false;
	}
	
	public String getStudentName(){
		return firstName + " "+ lastName;
	}

	public String getStudentInfo(){
		return firstName + " "+ lastName + " Student ID: " + studentID;
	}



}
