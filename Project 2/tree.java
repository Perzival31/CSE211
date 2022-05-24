public class tree {
	private Node start;
	
	public tree() {
		start = new Node (" ");
		start.nextDot = new Node("E");
		start.nextDash = new Node("T");
		start.nextDot.nextDot = new Node("I");
		start.nextDot.nextDash = new Node("A");
		start.nextDash.nextDot = new Node("N");
		start.nextDash.nextDash = new Node("M");
		start.nextDot.nextDot.nextDot = new Node("S");
		start.nextDot.nextDot.nextDash = new Node("U");
		start.nextDot.nextDash.nextDot = new Node("R");
		start.nextDot.nextDash.nextDash = new Node("W");
		start.nextDash.nextDot.nextDot = new Node("D");
		start.nextDash.nextDot.nextDash = new Node("K");
		start.nextDash.nextDash.nextDot = new Node("G");
		start.nextDash.nextDash.nextDash = new Node("O");
		start.nextDot.nextDot.nextDot.nextDot = new Node("H");
		start.nextDot.nextDot.nextDot.nextDash = new Node("V");
		start.nextDot.nextDot.nextDash.nextDot = new Node("F");
		start.nextDot.nextDash.nextDot.nextDot = new Node("L");
		start.nextDot.nextDash.nextDash.nextDot = new Node("P");
		start.nextDot.nextDash.nextDash.nextDash = new Node("J");
		start.nextDash.nextDot.nextDot.nextDot = new Node("B");
		start.nextDash.nextDot.nextDot.nextDash = new Node("X");
		start.nextDash.nextDot.nextDash.nextDot = new Node("C");
		start.nextDash.nextDot.nextDash.nextDash = new Node("Y");
		start.nextDash.nextDash.nextDot.nextDot = new Node("Z");
		start.nextDash.nextDash.nextDot.nextDash = new Node("Q");
		start.nextDot.nextDot.nextDot.nextDot.nextDot=new Node("5");
		start.nextDot.nextDot.nextDot.nextDot.nextDash=new Node("4");
		start.nextDot.nextDot.nextDot.nextDash.nextDash=new Node("3");
		start.nextDot.nextDot.nextDash.nextDash = new Node(" ");
		start.nextDot.nextDot.nextDash.nextDash.nextDash=new Node("2");
		start.nextDot.nextDash.nextDash.nextDash.nextDash=new Node("1");
		start.nextDash.nextDot.nextDot.nextDot.nextDot = new Node("6");
		start.nextDash.nextDash.nextDot.nextDot.nextDot = new Node("7");
		start.nextDash.nextDash.nextDash.nextDot = new Node(" ");
		start.nextDash.nextDash.nextDash.nextDot.nextDot = new Node("8");
		start.nextDash.nextDash.nextDash.nextDash = new Node(" ");
		start.nextDash.nextDash.nextDash.nextDash.nextDot = new Node("9");
		start.nextDash.nextDash.nextDash.nextDash.nextDash = new Node("0");
			
	}
	
	public String decode(String code){
		Node current = start;
		boolean exists = true;
		for (int i=0; (i<code.length() && exists); i++){
			if (code.substring(i, i+1).equals(".")){
				if (current.nextDot == null){
					exists = false;
				}
				current = current.nextDot;
			}
			else if (code.substring(i, i+1).equals("-")){
				if (current.nextDash == null){
					exists = false;
				}
				current = current.nextDash;
			}
		}
		if (exists){
			return (String) current.data;
		}
		return null;
	}
}

