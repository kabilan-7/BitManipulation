package bitmanipulation;

public class SetTheKthBit {
    public static void main(String[] args) {
        int n=9;
        int k=2;
        int ans=(1<<k) | n;
        System.out.println(ans);
    }
}
