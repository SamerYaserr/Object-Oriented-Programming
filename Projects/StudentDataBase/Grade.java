public enum Grade {
    Freshmen(1), Sophmore(2), Junior(3), Senior(4);

    private int toInt;

    Grade( int toInt ){
        this.toInt = toInt;
    }

    public int getToInt() {
        return toInt;
    }


}
