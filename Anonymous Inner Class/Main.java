import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    static void display( Showable s){

        s.display();
    }

    public static void main(String[] args) {

        RewardClass c1 = new RewardClass();
        RewardClass c2 = new RewardClass(){

            @Override
            public void print (){
                System.out.println("your reward is $20");
            }
        };

        c1.print();
        c2.print();


        //------------------------------------------------

        Showable s1 = new Showable() {
            @Override
            public void display() {
                System.out.println("Showable inner");
            }
        };

        s1.display();

        //------------------------------------------------

        s1 = () ->{
            System.out.println(" lambda1 ");
        };
        s1.display();


        s1 = () -> System.out.println(" lambda2 ");
        s1.display();

        //------------------------------------------------

        display(  new Showable() {
            @Override
            public void display() {
                System.out.println(" inner as argument");
            }

        } );

    }

}
