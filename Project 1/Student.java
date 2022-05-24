import java.math.*;
public class Student {
	//All the fields that will be associated with the Student object
	private String lastName;
    private String firstName;
    private int studentID;
    private double mathScore;
    private double sciScore;
    private double ssScore;
    private double laScore;
    private double csScore;
    private double totalScore;
    private String letterGrade;
    
    //A constructor for a new "Student" object that accepts a bunch of values and sets them to be the name and scores of the student
    public Student(String lastName, String firstName, int studentID, double mathScore, double sciScore, double ssScore, double laScore, double csScore, double totalScore, String letterGrade) {
    	this.lastName = lastName;
    	this.firstName = firstName;
    	this.studentID = studentID;
    	this.mathScore = mathScore;
    	this.sciScore = sciScore;
    	this.ssScore = ssScore;
    	this.laScore = laScore;
    	this.csScore = csScore;
    	this.totalScore = totalScore;
    	this.letterGrade = letterGrade;
    }
    
    //A constructor for a new "Student" object that doesn't accept anything and just starts the Student with default values
    public Student() {
    	lastName = null;
    	firstName = null;
    	studentID = 0;
    	mathScore = 0.0;
    	sciScore = 0.0;
    	ssScore = 0.0;
    	laScore = 0.0;
    	csScore = 0.0;
    	totalScore = 0.0;
    	letterGrade = null;
    }
    
    //Methods that let you set values for your Student object without having to pass in values during creation (Setters)
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    public void setSID(int studentID) {
    	this.studentID = studentID;
    }
    public void setMathScore(double mathScore) {
    	this.mathScore = mathScore;
    }
    public void setSciScore(double sciScore) {
    	this.sciScore = sciScore;
    }
    public void setssScore(double ssScore) {
    	this.ssScore = ssScore;
    }
    public void setlaScore(double laScore) {
    	this.laScore = laScore;
    }
    public void setcsScore(double csScore) {
    	this.csScore = csScore;
    }
    public void setTotalScore(double totalScore) {
    	this.totalScore = totalScore;
    }
    public void setLetterGrade(String letterGrade) {
    	this.letterGrade = letterGrade;
    }
    
    //Method that let you return individual values associated with this student if you want (Getters)
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getStudentID() {
        return studentID;
    }
    public double getMathScore() {
        return mathScore;
    }
    public double getSciScore() {
        return sciScore;
    }
    public double getSsScore() {
        return ssScore;
    }
    public double getLaScore() {
        return laScore;
    }
    public double getCsScore() {
        return csScore;
    }
    public double getTotalScore() {
    	return totalScore;
    }
    public String getLetterGrade() {
    	return letterGrade;
    }
    
	//Override toString method so we can do stuff like System.out.println(student);
    public String toString() {
    	return lastName + " " + firstName + " " + studentID + " " + mathScore + 
    			" " + sciScore + " " + ssScore + " " + laScore + " " + csScore + " " + 
    			this.getTotalScore() + " " + this.getLetterGrade();
    }    
}
