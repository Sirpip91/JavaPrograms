/* Bradley Allen
 * COSC-1173
 * 	 07/21/2021    
 *  HW 7	Chapter 9 Objects and Classes
 * */
// package
package allen;
//Course Class
public class Course {
	//creating a array of students to store the objects
	static Student[] studentArray = new Student[10];
	//main
	public static void main(String args[]) {
	//Adding 10 students to the array and using the constructor to create the different students information // I tested the setter down below
	studentArray[0] = new Student("Allen", "Bradley", 20451662,"ComputerScience" , 2.25);
	studentArray[1] = new Student("Happy", "John", 51662,"Marketing" , 2.75);
	studentArray[2] = new Student("Hankock", "John", 20451662,"Bussinuess" , 5.25);
	studentArray[3] = new Student("Frank", "Bean", 20451662,"Food" , 4.25);
	studentArray[4] = new Student("Keybaord", "Monitor", 20451662,"Tech" , 2.25);
	studentArray[5] = new Student("Jenkens", "Sally", 20451662,"Farming" , 3.25);
	studentArray[6] = new Student("Notebook", "Phone", 20451662,"Cramps" , 3.25);
	studentArray[7] = new Student("Water", "Run", 20451662,"Althetic" , 3.25);
	studentArray[8] = new Student("Gumball", "Sun", 20451662,"Fun" , 3.25);
	studentArray[9] = new Student("Jessica", "Moon", 20451662,"Farming" , 3.25);
	//using the setter to test
	studentArray[1].setLastname("SetterLastname");
	studentArray[1].setFirstname("SetterFirstname");
	//giving the first student 3 course grades this shoudld update their gpa and classes taken.
	studentArray[0].CourseGrade(85.0);
	studentArray[0].CourseGrade(70.0);
	studentArray[0].CourseGrade(80.0);
	//second student information
	studentArray[1].CourseGrade(100);
	studentArray[1].CourseGrade(90);
	studentArray[1].CourseGrade(98);
	//a loop to go through the array of students
	for(int i =0; i<studentArray.length; i++) {
		//using the different methods created in the Student class to ouptute infomration
		System.out.println("Name: " + studentArray[i].getNameLast()+ "," + studentArray[i].getNameFirst());
		System.out.println("Major: " + studentArray[i].getMajor());
		System.out.println("GPA: " + studentArray[i].getgpa());
		System.out.println("Classes Taken: " + studentArray[i].ClassesTaken());
		System.out.println("Scores Earned: " + studentArray[i].getScoresEarned());
		System.out.println("------------");
		}
	}//end of main
}//end of Course Class
