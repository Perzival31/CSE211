import java.util.Comparator;
public class SSComparator implements Comparator<Student>{
	public int compare(Student a, Student b) {
		int result = 0;
		if(a.getSsScore() < b.getSsScore()) {
			result = -1;
		}
		if(a.getSsScore() > b.getSsScore()) {
			result = 1;
		}
		return result;
	}
}
