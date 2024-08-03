package bitmanipulation;

public class ConvertToBinary {
    public static void main(String[] args) {
        StringBuilder res= new StringBuilder();
        int n=14;
        while (n!=0){
            if(n%2==1) res.append("1");
            else res.append("0");
            n/=2;
        }
        System.out.println(res.reverse());

    }
}
