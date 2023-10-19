public class Math {
    int val;
    public  Math() {}
    public Math(int val){
        this.val = val;
    }
    public Math add(Math obj){
        Math ret = new Math();
        ret.val = this.val + obj.val;
        return ret;
    }
    public boolean isEqual(Math obj){
        return obj.val == this.val;
    }
}