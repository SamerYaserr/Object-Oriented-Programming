import java.util.Scanner;

public class Student {

    private final int STUDENT_ID;
    private String name;
    private String password;
    private boolean loggedIn;
    static private int count = 1;
    static private String collage = "Mansoura";
    static private int minimalPasswordLength = 6;
    private final static int DEGREE_OF_SUCCESS = 55;

    public Student() {

        this.STUDENT_ID = count++;
        System.out.println("No data!");

    }

    Student(String name , String password){

        this.STUDENT_ID = count++;

        if( validatePassword(password) ){

            this.name = name;
            this.password = password;

            System.out.println("Hello " + name + ", Your id=" + STUDENT_ID + ".");

        }else{
            System.out.println("Error, The minimal length of the password is 6.");
        }
    }

    static private boolean validatePassword( String password ){

        if(password.length() >= minimalPasswordLength )
            return true;
        else
            return false;

    }

    private boolean correctPassword( String password ){

        if( password.equals( this.password ) )
            return true;
        else
            return false;

    }

    public boolean logIn( int id , String password ){

        if( this.STUDENT_ID == id && this.password.equals( password ) ){

            System.out.println("You are logged in.");
            loggedIn = true;

        }else{

            System.out.println("The password or id is wrong.");
            loggedIn = false;

        }

        return loggedIn;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return STUDENT_ID;
    }

    public static String getCollage() {
        return collage;
    }

    public void setPassword(String password) {

        System.out.println("Write the old password:");

        Scanner in = new Scanner( System.in );
        String oldPassword = in.next();

        if(correctPassword( oldPassword )){

            this.password = password;
            System.out.println("Done!");

        }else{

            System.out.println("The password is wrong.");

        }
    }

    public String toString(){

        return  "Student{" +
                "Nmae:'" + name + '\'' +
                ", Id=" + STUDENT_ID +
                ", Collage:'" + collage + '\'' +
                "}";

    }


}
