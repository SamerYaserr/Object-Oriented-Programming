public class Account {

    private int accountNo;
    private String name;
    private float amount;

    public void insert( int accountNo , String name , float amount ){
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void deposit( float amount ){

        this.amount += amount;
        System.out.println(amount + " deposited");

    }

    public void withdraw( float amount ){

        if(this.amount < amount){

            System.out.println("Your balance is’t enough");

        }else{

            this.amount -= amount;
            System.out.println(amount + " withdrawn");

        }
    }

    public void checkBalance(){

        System.out.println("Your balance is: " + amount );

    }

    @Override
    public String toString() {

        return "Account{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

}