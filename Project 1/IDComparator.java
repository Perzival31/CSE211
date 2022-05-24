import java.util.Comparator;
public class IDComparator implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.getStudentID()-b.getStudentID();
	}
}
