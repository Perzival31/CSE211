package coolpackage;

public class Mainclass {

	public static void main(String[] args) {
		//writeNums(n);
		//writeBinary(44);
		//int i = multiplyEvens(4);
		//System.out.println(i);
		//String s = repeat("hello", 3);
		//System.out.println(s);
		int j = permut(6,3);
		System.out.println(j);
	}
	
	public static int permut(int n, int r) {

		if (r==0) {
			return (1);
		}
		else {
			return (n*permut(n-1,r-1));
		}
	}
			

	public static void writeNums(int n) {

		if (n == 1) {
	        System.out.print("1");
	    } 
		
		else {
	        writeNums(n - 1);
	        System.out.print(", " + n);
	    }
		
	}
	
	public static void writeBinary(int n) {
		if (n==0) {
			System.out.print("");
		}
		else {
			writeBinary(n/2);
			System.out.print(n % 2);
		}
	}
	
	public static int multiplyEvens(int n) {
	    if (n <= 0) {
	        throw new IllegalArgumentException();
	        
	    } else if (n == 1) {
	        return 2;
	        
	    } else {
	        return 2 * n * multiplyEvens(n - 1);
	    }
	}
	
	public static String repeat(String s, int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		
		if (n==0) {
			return "";
		}
		
		String s2 = repeat(s, n/2);
		
			if(n % 2 == 0) {
				return s2 + s2;				
			}
			return s + s2 + s2;
	}

}
