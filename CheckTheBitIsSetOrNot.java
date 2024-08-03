package bitmanipulation;

public class CheckTheBitIsSetOrNot {
    public static void main(String[] args) {
        int n=13;
        int i=2;
        if(((n>>i)&1)==0) System.out.println("the bit is not set");
        else System.out.println("the bit is set");
    }
}
