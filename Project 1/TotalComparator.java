import java.util.Comparator;
public class TotalComparator implements Comparator<Student>{
	public int compare(Student a, Student b) {
		int result = 0;
		if(a.getTotalScore() < b.getTotalScore()) {
			result = -1;
		}
		if(a.getTotalScore() > b.getTotalScore()) {
			result = 1;
		}
		return result;
	}
}
