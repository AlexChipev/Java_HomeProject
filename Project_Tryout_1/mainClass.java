import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
public class mainClass {

	public static void main(String[] args) {
		
		
		Teacher 
				t1 = new Teacher("Anton", "Nedkov", 20, "Math"),
				t2 = new Teacher("N1","N2", 12,"Chemistry");
		
		Lecturer
				l1 = new Lecturer("Jeremy","Macintosh", 11, "MIT", 8);
		
		Professor
				prof1 = new Professor("Nick","Deivis", 14, "NBU", 5, "phd.prof");
		
		Assistant
				ass1 = new Assistant("Vassil","Ivanov", 8,"Technical University", 6, true);
		
		School_Teacher
					sct1 = new School_Teacher("John","Doe", 9, "Chemistry");
		//System.out.println(sct1.get_list_Of_Classes()); //връща си пълен списък :)

		//t1.goodDayWish();
		//ass1.get_firstName();
		//System.out.println(ass1.isCheafCheck(ass1.get_isCh_Assistant()));
		//System.out.println(l1.get_universityName());
		
		//Person arr[] =  {t1,l1,prof1,ass1,t2};
			//for (int i = 0; i < arr.length; i++) {
				//System.out.print(arr[i].get_firstName() + " ");
			//}
	}
}
