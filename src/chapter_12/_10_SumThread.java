package chapter_12;

public class _10_SumThread extends Thread{
    private long sum;
    public long getSum(){
        return sum;
    }
    public void setSum(long sum){
        this.sum = sum;
    }
    public void run(){
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
    }
}
