import java.util.Comparator;
public class LetterComparator implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.getLetterGrade().compareTo(b.getLetterGrade());
	}
}
