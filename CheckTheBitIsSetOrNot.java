package bitmanipulation;

public class CheckTheBitIsSetOrNot {
    static class Pair{
        int num;
        int freq;
        Pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
        
    }
    public static void main(String[] args) {
        Pair pair = new Pair(2,3);
        System.out.println(pair.freq);
    }
}
