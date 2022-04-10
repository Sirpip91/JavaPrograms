/* Bradley Allen
 * COSC-1173
 * 07/21/2021
 * HW 7
 * Chapter 9 Objects and Classes
 */
//package allen
package allen;
//Student Class
public class Student {
	// The variables that each student will contain
	private String Lastname;
	private	String Firstname;
	private	int StudentID;
	private	String Major;
	private	double gpa;
	private	int ClassesTaken;
	private	double Scoresearned;
	
	//constructor
	Student(String Lastname, String Firstname, int StudentID, String Major,
			double gpa){
		//This is for hardcoding into the constructor.... the getter and setter work I wanted to fill the entire array quickly
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.StudentID = StudentID;
		this.Major = Major;
		}
	//Here are the setter and getter methods
	//setter method for first name;
	public void setFirstname(String firstname){
		this.Firstname = firstname;
	}
	//setter method for last name;
	public void setLastname(String lastname){
		//sets this objects last name to methods lastname
		this.Lastname = lastname;
		}
	//setter method for Student ID;
	public void setStudentID(int id){
		//sets this objects variable equal to what id
		this.StudentID = id;
	}
	//setter method for Major;
	public void setMajor(String major){
		this.Major = major;
	}
	//getter method returns firstname
	public String getNameFirst() {
		return Firstname;
	//getter method returns lastname
	}
	public String getNameLast() {
		return Lastname;
		}
	//getter method returns ID
	public int getID() {
		//returns the StudentID. aka getter method
		return StudentID;
		}
	//getter method returns Major
	public String getMajor() {
		return Major;
		}
	//getter method returns gpa
		public double getgpa() {
			return gpa;
			}
		//getter method returns Major
		public int ClassesTaken() {
			return ClassesTaken;
			}
		//getter method returns Scoresearned
		public double getScoresEarned() {
			return Scoresearned;
		}
	
	//method takes in course grade
	void CourseGrade(double courseGrade) {
		//increments classes by one
		ClassesTaken++;
		//adds new grade to scores earned
		Scoresearned =+ courseGrade;
		//gpa update
		gpa = (Scoresearned/ClassesTaken);
	}
}//end of Student Class
