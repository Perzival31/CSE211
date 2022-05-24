import java.util.Comparator;
public class SciComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		int result = 0;
		if(a.getSciScore() < b.getSciScore()) {
			result = -1;
		}
		if(a.getSciScore() > b.getSciScore()) {
			result = 1;
		}
		return result;
	}
}
