public enum AbstractEnum {

    Enum1 () {
        void print(){
            System.out.println("Enum1");
        }
    }
    , Enum2() {
        void print(){
            System.out.println("Enum2");
        }
    };

    abstract void print();


}
