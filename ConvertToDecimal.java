package bitmanipulation;

public class ConvertToDecimal {
    public static void main(String[] args) {
        String bin="1101";
        int p2=1;
        int num=0;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1') num+=p2;
            p2=p2*2;
        }
        System.out.println(num);
    }
}
