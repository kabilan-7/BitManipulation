package bitmanipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        a=a^b;
        System.out.println("a=-->"+a);
        b=a^b;
        System.out.println("b-->"+b);
        a=a^b;
        System.out.println(a);

    }
}
