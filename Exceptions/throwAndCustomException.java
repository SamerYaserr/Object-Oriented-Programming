import java.util.*;


public class Main {
    public static void main(String[] args) {

        //validateNoArg( -1 );


        System.out.println("-------------1-------------");
        //---------------------------------1-----------------------------


        //validateWithArg(-1);


        System.out.println("-------------2-------------");
        //---------------------------------2-----------------------------


        try{

            validateWithArg( -1 );

        }catch ( ArithmeticException e){

            System.out.println(e);

        }


        System.out.println("-------------3-------------");
        //---------------------------------3-----------------------------


        try{

            int x = 5 / 0;

        }catch ( ArithmeticException e){

            System.out.println(e);
           // throw new ArithmeticException("New Throw");

        }finally{

            System.out.println("Finally block");

        }

        System.out.println("the rest of the code");


        System.out.println("-------------4-------------");
        //---------------------------------4-----------------------------


        try{

            validateMyException( -1 );

        }catch ( MyException e){

            System.out.println(e);

        }


        System.out.println("-------------5-------------");
        //---------------------------------5-----------------------------


        try {
            Scanner in = new Scanner(System.in);
            Bank ac = new Bank();
            String option = "";

            do {

                System.out.println("1. DEPOSIT");
                System.out.println("2. WITHDRAW");
                System.out.println("3. BALANCE ENQUIRY");
                System.out.println("ENTER OPTION");

                option = in.next();

                switch (option) {

                    case "1": {

                        System.out.println("Enter deposit amount");
                        double amount = in.nextDouble();
                        ac.deposit(amount);
                        ac.balanceEnquiry();
                        break;

                    }

                    case "2": {

                        System.out.println("Enter withdraw amount");
                        double amount = in.nextDouble();
                        System.out.println("Withdraw amount is :" + ac.withdraw(amount));
                        ac.balanceEnquiry();
                        break;

                    }

                    case "3": {

                        ac.balanceEnquiry();
                        break;

                    }

                    default:
                        System.out.println("Invalid option");

                }

                System.out.println("Do you wnt to continue (YES/NO)");
                option = in.next();

            } while (option.equalsIgnoreCase("YES"));

        }catch ( InvalidAmountException iae ){

            System.out.println(iae.getMessage());

        }catch ( InsufficientFundsException ife){

            System.out.println(ife.getMessage());

        }catch ( NumberFormatException nfo ){

            System.out.println(nfo.getMessage());

        }catch ( InputMismatchException ime ){

            System.out.println(ime.getMessage());

        }


    }





    //--------------------------------methods--------------------------------------


    public static void validateNoArg( int number ){

        if( number <= 0 ){

            throw new ArithmeticException();

        }else {

            System.out.println("The number has been entered");
        }
    }

    public static void validateWithArg( int number ){

        if( number <= 0 ){

            throw new ArithmeticException("The number must be greater than zero");

        }else {

            System.out.println("The number has been entered");
        }
    }

    public static void validateMyException( int number ){

        if( number <= 0 ){

            MyException e = new MyException("the number must be greater than zero.");
            throw e;

        }else {

            System.out.println("The number has been entered");
        }
    }

}
