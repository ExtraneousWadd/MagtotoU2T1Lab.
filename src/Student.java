public class Student {

    private String stuName;
    private int stuAge;
    private double gpa;

    public Student(String studentName, int studentAge, double studentGPA) {
        stuName = studentName;
        stuAge = studentAge;
        gpa = studentGPA;
    }

    public void introduce() {
        System.out.print("Hello my name is " + stuName);
        if (stuAge > 18) {
            System.out.println(". I am a college student.");
        } else if (stuAge > 14) {
            System.out.println(". I am a high school student.");
        } else if (stuAge > 11) {
            System.out.println(". I am a middle school student.");
        } else {
            System.out.println(". I am a elementary school student.");
        }
    }

    public void printStudentInfo() {
        System.out.println("Name: " + stuName);
        System.out.println("Age: " + stuAge);
        System.out.println("GPA: " + gpa);
    }
}


