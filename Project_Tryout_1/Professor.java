
public class Professor extends Lecturer {
	
	private String title;
	
	protected String get_title(){
		return this.title;
	}
	
	protected Professor(String firstName, String lastName, int service, String universityName, int lectures, String title){
			super(firstName, lastName, service, universityName, lectures);
			
			this.title = title;

			System.out.println(title(title));
			
	}
@Override
	public int lectures(int lectures){
		
		return lectures;
	}
	private String title(String title){
		
		String output = String.format("Title: %s", title);
		return output;
	}
@Override
	public void check_Homeworks(){
		System.out.println("Professor check homewokrks");
	}
@Override
	public void exams(){
		System.out.println("Conduct exams");
	}
	
}
