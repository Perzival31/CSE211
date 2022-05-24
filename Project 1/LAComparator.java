import java.util.Comparator;
public class LAComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		int result = 0;
		if(a.getLaScore() < b.getLaScore()) {
			result = -1;
		}
		if(a.getLaScore() > b.getLaScore()) {
			result = 1;
		}
		return result;
	}
}
