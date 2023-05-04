//samvil_225
public class student225 extends Person225 {
private static final String PREFIX = "R/BCA-2019";
Results225 data = new Results225();
private String rollno;
private char grade;
private int joinyear;
student225(String name, String rollno, int [] marks)
{
super();
this.name = name;
this.rollno = rollno;
this.data.marks = marks;
}
void displayresults()
{
//compute average
int sum=0;
float avg=0;
avg = computeAverage(sum);
//compute grade
grade = computeGrades(avg);
System.out.println("Result of " + name.toUpperCase());
System.out.println("Roll no is " + PREFIX + rollno);
System.out.println("Grade is " + grade);

}
private char computeGrades(float avg) {
	//char grade;
	if(avg >80)
	grade = 'A';
	else if (avg >60 && avg <=80)
	grade = 'B';
	else if (avg >50 && avg <=60)
	grade = 'C';
	else if (avg >40 && avg <=50)
	grade = 'D';
	else
	grade = 'F';
	return grade;
}
private float computeAverage(int sum) {
	float avg;
	for (int i=0; i< data.marks.length;i++)
	sum+= data.marks[i];
	avg = sum/data.marks.length;
	return avg;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
int[] marks = {90,80,70,56,89};
student225 sue = new student225("Anne Sue", "777", marks);
sue.displayresults();
System.out.println("sadasd");
}
}
