class Student {
  
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 50)
            return 'D';
        else
            return 'F';
    }

    void display() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println();
    }
}

public class StudentRecord {
    public static void main(String[] args) {

        Student s1 = new Student("Arun", 101, 85);
        Student s2 = new Student("Priya", 102, 92);

        System.out.println("Student 1 Details");
        s1.display();

        System.out.println("Student 2 Details");
        s2.display();
    }
}
