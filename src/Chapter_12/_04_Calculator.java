package Chapter_12;

public class _04_Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }

    public void setMemory(int memory){
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (Exception e) { }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}
