public class Product {

    private String name;
    private String description;
    private String color;
    private float price;
    private float discount;
    private  int quantity;

    // no Arg constructor
    public Product(){

        this.name = "no name";
        this.description = "no description";
        this.color = "no color";
        this.price = 0;
        this.discount = 0;
        this.quantity = 0;

    }

    // Parameterized constructor
    public Product( String name , String description , String color , float price , float discount , int quantity ){

        this.name = name;
        this.description = description;
        this.color = color;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;

    }

    // Copy constructor
    public Product( Product obj ){

        this( obj.name , obj.description , obj.color , obj.price , obj.discount , obj.quantity);

    }

    public void setName( String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription( String description ){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setColor( String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice( float price ){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    public void setDiscount( float discount ){
        this.discount = discount;
    }

    public float getDiscount(){
        return discount;
    }

    public void setQuantity( int quantity ){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        return  "Product{" +
                "Name:'" + name + '\'' +
                ", Description:'" + description + '\'' +
                ", Color:'" + color + '\'' +
                ", Price=" + price +
                ", Discount=" + discount + "%" +
                ", Quantity=" + quantity +
                '}';
    }

}