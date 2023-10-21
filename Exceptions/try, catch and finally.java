import java.sql.SQLOutput;
import java.util.*;
import java.util.EnumSet;
import java.util.EnumMap;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {

        try{

            int [] arr = new int[]{1,2,3};
            System.out.println( arr[3] );

        }
        catch ( java.lang.ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }

        System.out.println("Rest of the code");


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------

        try{

            int [] arr = null ;
            System.out.println( arr[3] );

        }
        catch ( NullPointerException e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{
            int val = Integer.parseInt( "Samer");
        }
        catch ( NumberFormatException e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{

            System.out.println("before exception");
            int x = 5 / 0;
            System.out.println("after exception");

        }
        catch ( ArithmeticException e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{

            int val = Integer.parseInt( "Samer");
            int x = 5 / 0;

        }
        catch ( ArithmeticException e ){
            System.out.println(e);
        }
        catch ( NumberFormatException e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{

            int [] arr = new int[]{1,2,3};
            arr[5] = 5 / 0;

        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }
        catch ( ArithmeticException e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{

            int [] arr = new int[]{1,2,3};
            arr[5] = 5 ;

        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{
            int val = Integer.parseInt( "Samer");
        }
        catch ( Exception e ){
            System.out.println(e);
        }


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{

            int [] arr = new int[]{1,2,3};
            System.out.println( arr[3] );

        }
        catch ( java.lang.ArrayIndexOutOfBoundsException e ){

            System.out.println(e);
            //return;

        }
        finally {
            System.out.println("Finally");
        }

        System.out.println("Rest of the code");


        System.out.println("---------------------------------------");
        //---------------------------------------------------------------------------------


        try{

            int [] arr = new int[]{1,2,3};
            System.out.println( arr[5] );

        }
        catch ( java.lang.ArrayIndexOutOfBoundsException e ){

            System.out.println(e);
            //System.exit(0);

        }
        finally {
            System.out.println("Finally");
        }


    }

}
