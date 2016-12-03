
public abstract class Person {
	
	private String
					firstName,
					lastName;

	private int sevrice;
	
	protected String get_firstName(){
		return this.firstName;
	}
	
	protected String get_lastName(){
		return this.lastName;
	}
	
	protected int get_service(){
		return this.sevrice;
	}
	
	public Person(String firstName, String lastName, int service){
		this.firstName = firstName;
		this.lastName = lastName;
		this.sevrice = service;
	}
	public Person() {}
	


}
