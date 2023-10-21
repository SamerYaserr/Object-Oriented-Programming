import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.EnumSet;
import java.util.EnumMap;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {

        readFile("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA.txt");

        readFile("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA1.txt");


        System.out.println("------------------------1-----------------------------");
        //-----------------------------------------------------------------------------------------------


        readFileAndDisplay("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA.txt");

        readFileAndDisplay("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA1.txt");


        System.out.println("-------------------------2----------------------------");
        //-----------------------------------------------------------------------------------------------


        readFileAndDisplayWithoutFinally("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA.txt");

        readFileAndDisplayWithoutFinally("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA1.txt");


        System.out.println("-------------------------3----------------------------");
        //-----------------------------------------------------------------------------------------------


        try {

            readFileAndDisplayWithThrow("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA.txt");

        }catch ( FileNotFoundException  e ){

            System.out.println( e );

        }catch ( IOException e ){

            System.out.println(e );

        }

        try {

            readFileAndDisplayWithThrow("C:\\Users\\SAMER YASER\\Desktop\\codes\\LCA\\LCA1.txt");

        }catch ( FileNotFoundException  e ){

            System.out.println( e );

        }catch ( IOException e ){

            System.out.println(e );

        }


        System.out.println("-------------------------4----------------------------");
        //-----------------------------------------------------------------------------------------------

                                      // this not preferred with errors
        try{

            f();

        }catch ( Error e ){

            System.out.println(e);

        }

    }


    static void readFile ( String filePath ){

        try{

            FileReader reader = new FileReader( filePath );

        } catch ( FileNotFoundException e ){

            System.out.println(e);

        }

    }


    static void readFileAndDisplay( String filePath ){

        FileInputStream fin = null;

        try{

            fin = new FileInputStream( filePath );

            System.out.println("file content: ");
            int r = 0;
            while( (r = fin.read() ) != -1){
                System.out.print( (char) r );
            }

        }catch ( FileNotFoundException e){

            System.out.println(e);

        }catch ( IOException e ){

            System.out.println( e );

        }
        finally {

            if( fin != null) {
                try {

                    fin.close();

                } catch (IOException e) {

                    System.out.println(e);

                }
            }

        }
    }


    static void readFileAndDisplayWithoutFinally( String filePath ){


        try( FileInputStream fin = new FileInputStream( filePath ) ; ){


            System.out.println("file content: ");
            int r = 0;
            while( (r = fin.read() ) != -1){
                System.out.print( (char) r );
            }

        }catch ( FileNotFoundException e){

            System.out.println(e);

        }catch ( IOException e ){

            System.out.println( e );

        }

    }


    static void readFileAndDisplayWithThrow( String filePath ) throws FileNotFoundException , IOException {

        FileInputStream fin = new FileInputStream( filePath );

            System.out.println("file content: ");
            int r = 0;
            while( (r = fin.read() ) != -1){
                System.out.print( (char) r );
            }


    }


    static  void f(){

        System.out.println("f()");
        f();

    }




}
