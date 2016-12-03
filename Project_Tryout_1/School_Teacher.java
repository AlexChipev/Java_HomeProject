import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class School_Teacher extends Teacher {

	private ArrayList<String> list_Of_Classes;
	
	protected ArrayList<String> get_list_Of_Classes(){
		return this.list_Of_Classes;
	}
	
	public School_Teacher(String firstName, String lastName, int service, String subject) {
			super(firstName, lastName, service, subject);
			
			this.list_Of_Classes = print_list_Of_Classes();
			
			System.out.print("Teaches to grades: ");
			for(String element : print_list_Of_Classes()){

				System.out.print(element + " / ");
			}
	}
	private ArrayList<String> print_list_Of_Classes() {
		ArrayList <String> list = new ArrayList<String>(5);
		String arr[] = {"5d","5b","3c","4d","2a","2b", "4c","6f","3a"};
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++){
			
			list.add(arr[rand.nextInt(arr.length-1)]);//TODO: проверка за еднаквост
		}
		return list;
	}
}
