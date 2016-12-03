
public class Assistant extends Lecturer {
	private boolean isCh_Assistant;
	
	protected boolean get_isCh_Assistant(){
		return this.isCh_Assistant;
	}
	
	protected Assistant(String firstName, String lastName, int service, String universityName, int lectures, boolean isCh_Assistant){
			super(firstName, lastName, service, universityName, lectures);
			
			this.isCh_Assistant = isCh_Assistant;
			System.out.println(isCheafCheck(isCh_Assistant));
			write_Articles();
	}
@Override
	public int lectures(int lectures){
		
		return lectures;
	}
	protected String isCheafCheck(boolean isCheaf){
		
		return (isCheaf == true) ? "Cheaf Assistant" : "Assistant";
	}
	private void write_Articles() {
		System.out.println("Write articles");
	}
@Override
	public void check_Homeworks(){
		System.out.println("Assistant check homewokrks");
	}
@Override
	public void exams(){
	
	System.out.println("Check exams");
}
}
