package bitmanipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        int n=13 ,i=2;
        int ans=(~(1<<i))&n;
        System.out.println(ans);
    }
}
