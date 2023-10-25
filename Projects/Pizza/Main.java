public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(false);
        pizza1.addExtraCheese();
        pizza1.addExtraTopping();
        pizza1.takeAway();
        pizza1.getBill();

        System.out.println("------------------1-------------------");

        Pizza pizza2 = new Pizza( true );
        pizza2.addExtraCheese();
        pizza2.getBill();

        System.out.println("------------------2-------------------");

        DeluxPizza pizza3 = new DeluxPizza( false );
        pizza3.takeAway();
        pizza3.getBill();



    }
}