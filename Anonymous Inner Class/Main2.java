import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {

        TestClass t1 = new TestClass();

        t1.testMethod();
        System.out.println("-----------------------------------");

        //----------------------------------------

        TestClass t2 = new TestClass() {

            @Override
            public void testMethod() {
                System.out.println(" Anonymous inner class2");
            }
        };

        t2.testMethod();
        System.out.println("-----------------------------------");


        //------------------------------------------

        TestClass t3 = new TestClass() {

            {
                System.out.println("Block");
            }
            @Override
            public void testMethod() {
                System.out.println(" Anonymous inner class3");
            }
        };

        System.out.println("-----------------------------------");


        //--------------------------------------------

        var t4 = new TestClass(){

            public void testMethod() {
                System.out.println(" Anonymous inner class4");
            }

            public void testMethod2(int x){
                System.out.println("x= " + x );
            }

        };

        t4.testMethod2( 7 );

        System.out.println("-----------------------------------");




    }

}
