
public class College_Teacher extends Teacher{

	private String college_Name;
	
	protected String get_college_Name() {
		return this.college_Name;
	}
	
	public College_Teacher(String firstName, String lastName, int service, String subject, String college_Name) {
						super(firstName, lastName, service, subject);
				
				this.college_Name = college_Name;
				kids_Entertainment();
	}
	private void kids_Entertainment(){
		System.out.println("Entertain kids");
	}
	
}
