import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    static void printChoices(){

        System.out.println("Chose your order:");
        System.out.println("1. Add element.");
        System.out.println("2. Remove element.");
        System.out.println("3. Print elements.");
        System.out.println("4. Exit.");

    }
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );

        ArrayList <Integer> arr = new ArrayList();

        while(true){

            printChoices();

            int choice = in.nextInt() , element;
            if( choice == 1){

                System.out.println("Enter an integer:");
                element = in.nextInt();
                arr.add(element);
                System.out.println("Element added.");

            }else if( choice == 2){

                System.out.println("Enter an element to remove:");
                element = in.nextInt();

                if( arr.contains( element ) ) {

                    arr.remove( (Integer) element);
                    System.out.println("Element removed.");

                }else
                    System.out.println("Element not found.");

            }else if( choice == 3 ){

                System.out.println("Elements = " + arr );

            }else
                return;

        }

    }
}
