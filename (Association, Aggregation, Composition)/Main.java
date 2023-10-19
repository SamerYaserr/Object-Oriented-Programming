import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {

        Department dept = new Department(2002,"SC");
        Employee emp = new Employee(  1000000 , "Samer" ,"Yaser" , "Zagloul" , "A+" , "1244" , "Egyptian" , 2002 , dept);
        System.out.println(emp);

    }
}
