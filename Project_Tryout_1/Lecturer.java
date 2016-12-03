
public class Lecturer extends Person implements Lectures_Enumerable {

	private String universityName;
	private int lectures;
	
	protected int get_lectures(){
		return this.lectures;
	}
	
	protected String get_universityName(){
		return this.universityName;
	}
	
	public Lecturer(String firstName, String lastName, int service, String universityName, int lectures){
			super(firstName, lastName, service);
			
			this.lectures = lectures;
			this.universityName = universityName;
			
			String output = String.format("\nFirst Name: %s\nLast Name: %s\nUniversity Name: %s\nLecures weekly: %d\nService: %d years",
											firstName, lastName, universityName, lectures(lectures), service);
			System.out.println(output);
			check_Homeworks();
			exams();
	}
@Override
	public int lectures(int lectures){
		
		return lectures;
	}
	protected void goodDayWish(){
		System.out.print("Method for good day wish");
	}
	
	protected void classwork(String nameOfClasswork){
		
		String output = String.format("Name of classwork: %s", nameOfClasswork);
		System.out.println(output);
	}
	protected void classwork(String theme, int pointsGiven){
		
		String output = String.format("Theme: s%\nPoints given: %d points", 
									 theme, pointsGiven);
		System.out.println(output);
	}
	protected String classwork(boolean isCompleted){
		
		return (isCompleted == true) ? "Classwork completed succesfuly!" : "Classwork not completed!";
	}
	public void check_Homeworks(){
		System.out.println("Lecturer check homeworks");
	}
	public void exams(){
		System.out.print("");
	}
}
