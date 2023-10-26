import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );

        int numberOfNewStudent;

        System.out.print("Enter number of new student to enroll:");
        numberOfNewStudent = in.nextInt();

        Student [] students = new Student[ numberOfNewStudent ];
        for( int i = 0 ; i < numberOfNewStudent ; i++){

            System.out.println("Student " + (i + 1) + ":" );
            students[i] = new Student();
            students[i].courseEnrolling();
            students[i].payTuition();
            System.out.println("---------------------------------------");

        }

        for( Student student : students ){
            student.statusOfStudent();
            System.out.println("---------------------------------------");
        }

    }
}