import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private  Grade gradeYear;
    private String studentId;
    private double balance;
    private static int currentId = 1000;
    ArrayList<Courses> courses = new ArrayList<>();
    private final static int COST_OF_COURSE = 600;




    public Student(  ){

        Scanner in = new Scanner( System.in );

        System.out.print("Enter student first name:");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name:");
        this.lastName = in.nextLine();

        System.out.print("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\nEnter student grade year:");
        int action = in.nextInt();

        for( Grade checkGrade : Grade.values() ){

            if(action == checkGrade.getToInt())
                gradeYear = checkGrade;

        }

        currentId++;
        createId();


    }

    private void createId( ){

        this.studentId = gradeYear.getToInt() + ""  + currentId;

    }

    public void courseEnrolling(){

        Scanner in = new Scanner( System.in );
        int action;

        System.out.println("For each course (Enter 1 if you want to enroll otherwise enter 0):");

        for( Courses checkCourse : Courses.values() ){

            System.out.print ( checkCourse.toString() + ":");
            action = in.nextInt();

            if( action == 1 ){
                balance += COST_OF_COURSE;
                courses.add( checkCourse );
            }

        }

    }

    public void viewBalance(){

        System.out.println("Your current balance: " + balance );

    }

    public void payTuition( ){

        viewBalance();

        Scanner in = new Scanner( System.in );

        System.out.print("Enter your payment: ");
        double amount = in.nextDouble();

        balance -= amount;

        viewBalance();

    }

    public void statusOfStudent(){

        System.out.println("Name: " + firstName + " " + lastName );
        System.out.println("Student grade level: " + gradeYear.toString() );
        System.out.println("Student id= " + studentId );
        System.out.println("Student courses: " + courses );
        System.out.println("Student balance= " +  balance );

    }



}
