public class StudentRunner {
    public static void main(String [] args) {

        Student student1 = new Student("James",11, 3.0);
        student1.introduce();
        student1.printStudentInfo();

        Student student2 = new Student("Daniel", 16, 3.2);
        student2.introduce();
        student2.printStudentInfo();
    }
}