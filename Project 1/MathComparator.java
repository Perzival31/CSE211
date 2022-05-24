import java.util.Comparator;
public class MathComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		int result = 0;
		if(a.getMathScore() < b.getMathScore()) {
			result = -1;
		}
		if(a.getMathScore() > b.getMathScore()) {
			result = 1;
		}
		return result;
	}
}
