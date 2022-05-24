import java.util.Comparator;
public class CSComparator implements Comparator<Student>{
	public int compare(Student a, Student b) {
		int result = 0;
		if(a.getCsScore() < b.getCsScore()) {
			result = -1;
		}
		if(a.getCsScore() > b.getCsScore()) {
			result = 1;
		}
		return result;
	}
}
