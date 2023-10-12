public class Car {

    private String name ;
    private int model ;
    private int price ;
    private int maxSpeed ;

    public void setName( String n){

        name = n;

    }

    public String getName(){
        return name;
    }

    public void setModel( int m ){

        if( m > 2015 )
            model = m;
        else
            System.out.println("We can’t accept cars with that model");

    }

    public int getModel(){
        return model;
    }

    public void setMaxSpeed( int m ){

        if( m >= 100 )
            maxSpeed = m;
        else
            System.out.println("We can’t accept cars with that maxSpeed");

    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setPrice( int p ){

        if( p <= 1000000 )
            price = p;
        else
            System.out.println("The car is very expensive");

    }

    public int getPrice() {
        return price;
    }


}