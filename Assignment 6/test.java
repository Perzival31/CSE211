package arraylist;

public class test {

	public static void main(String[] args) { 
		//testlastIndexOf();
		//testindexOfSubList();
		//testrunningTotal();
		//testcount();
		testremoveLast();
	}

	private static void testremoveLast() {
		ArrayIntList list = new ArrayIntList();
		list.add(2);
		list.add(-3);
		list.add(2);
		list.add(0);
		list.add(5);
		
		int answer = list.removeLast();
		System.out.println(answer);
		System.out.println(list.toString());
		
		answer = list.removeLast();
		System.out.println(answer);
		System.out.println(list.toString());
		
		
	}

	private static void testcount() {
		ArrayIntList list = new ArrayIntList();
		list.add(2);
		list.add(-3);
		list.add(2);
		list.add(0);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(6);
		int answer = list.count(2);
		System.out.println(answer);
		
	}

	private static void testrunningTotal() {
		ArrayIntList list = new ArrayIntList();
		ArrayIntList answer = new ArrayIntList();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(15);
		list.add(20);
		list.add(7);
		
		answer = list.runningTotal();
		System.out.println(answer.toString());
		
	}

	private static void testindexOfSubList() {
		ArrayIntList list1 = new ArrayIntList();
		ArrayIntList list2 = new ArrayIntList();
		
		list1.add(11);
		list1.add(-7);
		list1.add(3);
		list1.add(42);
		list1.add(0);
		list1.add(14);
		
		list2.add(3);
		list2.add(42);
		list2.add(0);
		
		int answer = list1.indexOfSubList(list2);
		System.out.println(answer);
	}

	private static void testlastIndexOf() {
	ArrayIntList list = new ArrayIntList();
		
		list.add(1);
		list.add(18);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(18);
		list.add(1);
		list.add(1);
		
		int lastIndexof = list.lastIndexOf(18);
		System.out.println(lastIndexof);
		
	}

}
