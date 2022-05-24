
import java.io.*;
import java.util.*;


public class testclient
{
	public static void main(String [] args) throws FileNotFoundException
	{

		ArrayList<Student> studentlist = new ArrayList<Student>();
	//	BufferedReader reader = new BufferedReader(new FileReader("students.csv"));
		File file = new File("students.csv");
		String line;
		int num = 0;
		Scanner scan = new Scanner(file);
		Scanner datascan = null;
		
		
		
		while(scan.hasNextLine())
		{
			datascan = new Scanner(scan.nextLine());
			datascan.useDelimiter(",");
			Student test = new Student();
			
			while(datascan.hasNext())
			{
				String value = datascan.next();
				
				//each type of number's relative location is already known, we set these to their respective values
				if(num == 0)
				{
					test.setLastName(value);
				}
				else if(num == 1)
				{
					test.setFirstName(value);
				}
				else if(num == 2)
				{
					test.setSID(Integer.parseInt(value));
				}
				else if(num == 3)
				{
					test.setMathScore(Double.parseDouble(value));
				}
				else if(num == 4)
				{
					test.setSciScore(Double.parseDouble(value));
				}
				else if(num == 5)
				{
					test.setssScore(Double.parseDouble(value));
				}
				else if(num == 6)
				{
					test.setlaScore(Double.parseDouble(value));
				}
				else if(num == 7)
				{
					test.setcsScore(Double.parseDouble(value));
				}
				else if(num == 8)
				{
					test.setTotalScore(Double.parseDouble(value));
				}
				else if(num == 9)
				{
					test.setLetterGrade(value);
				}
				
				num++;
			}
			
			num = 0;
			studentlist.add(test);
		}
		
		scan.close();
		
		//Everything except lettergrade and overall grade are set as student attributes, uncomment to fix this
		//studentlist now has all the students in it as elements. accessible by get()
		System.out.println(studentlist);
		//prints 5th student
		System.out.println(studentlist.get(4));
		//Comparator Test
		SSComparator compare1 = new SSComparator();
		
		int i = compare1.compare(studentlist.get(1), studentlist.get(4));
		System.out.println(i);
		
	
			
	}
	
}
