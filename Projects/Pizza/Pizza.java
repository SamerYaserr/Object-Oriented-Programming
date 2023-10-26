public class Pizza {

    private int price;
    private boolean veg;
    private int basePizzaPrice;


    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeAwayOpted = false;


    final static int VEG_PIZZA_PRICE = 300;
    final static int NON_VEG_PIZZA_PRICE = 300;
    final static int EXTRA_CHEESE_PRICE = 100;
    final static int EXTRA_TOPPING_PRICE = 150;
    final static int BACK_PACK_PRICE = 20;


    public Pizza( boolean veg ){

        this.veg = veg;

        if( veg ){
            price = VEG_PIZZA_PRICE;
        }else {
            price = NON_VEG_PIZZA_PRICE;
        }

        basePizzaPrice = price;

    }

    public void addExtraCheese(){

        price += EXTRA_CHEESE_PRICE;
        isExtraCheeseAdded = true;

    }

    public void addExtraTopping(){

        price += EXTRA_TOPPING_PRICE;
        isExtraToppingAdded = true;

    }

    public void takeAway(){

        price += BACK_PACK_PRICE;
        isTakeAwayOpted = true;

    }

    public void getBill(){

        System.out.println("Pizza: " + basePizzaPrice );

        if( isExtraCheeseAdded )
            System.out.println("Extra cheese added: " + EXTRA_CHEESE_PRICE );
        if( isExtraToppingAdded )
            System.out.println("Extra topping added: " + EXTRA_TOPPING_PRICE );
        if( isTakeAwayOpted )
            System.out.println("Take away: " + BACK_PACK_PRICE );

        System.out.println("Bill: " + price);


    }

}
