import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		tree morse = new tree();
		ArrayList<String> code = new ArrayList<>();
		code.add("....");
		code.add(".");
		code.add(".-..");
		code.add(".-..");
		code.add("---");
		code.add(" ");
		code.add(".--");
		code.add("---");
		code.add(".-.");
		code.add(".-..");
		code.add("-..");
		
		for (int i = 0; i < code.size(); i++) {

			System.out.print(morse.decode(code.get(i)));
		}
		
	}

}
