
public class Teacher extends Person {

	private String subject;
		
	protected String get_subject(){
		return this.subject;
	}
	
	public Teacher(String firstName, String lastName, int service, String subject) {
			super(firstName, lastName, service);
			
			String output = String.format("\nFirst name: %s\nSecond name: %s\nSubject: %s\nService: %d years\n",
											firstName, lastName, subject, service);
			System.out.print(output);
			check_Homeworks();
	}
	
	protected void goodDayWish(){
		System.out.println("Method for good day wish");
	}
	
	protected void farewellWish(){
		System.out.println("Method for goodbye wish");
	}
	private void check_Homeworks(){
		System.out.println("Check homeworks!");
	}
}
