class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name       : " + name);
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    Marks(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    void displayMarks() {
        System.out.println("Subject 1  : " + m1);
        System.out.println("Subject 2  : " + m2);
        System.out.println("Subject 3  : " + m3);
        System.out.println("Subject 4  : " + m4);
        System.out.println("Subject 5  : " + m5);
    }
}
class Result extends Marks {

    Result(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    int calculateTotal() {
        return m1 + m2 + m3 + m4 + m5;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    char calculateGrade() {
        double average = calculateAverage();

        if (average >= 90)
            return 'A';
        else if (average >= 75)
            return 'B';
        else if (average >= 60)
            return 'C';
        else if (average >= 50)
            return 'D';
        else
            return 'F';
    }

    void displayResult() {
        displayStudent();
        displayMarks();

        System.out.println("Total      : " + calculateTotal());
        System.out.println("Average    : " + calculateAverage());
        System.out.println("Grade      : " + calculateGrade());
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Result student = new Result(101, "Arun",
                                    85, 90, 78, 88, 92);

        System.out.println("Student Result");
        System.out.println("--------------");

        student.displayResult();
    }
}
