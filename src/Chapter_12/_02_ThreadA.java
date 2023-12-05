package Chapter_12;

public class _02_ThreadA extends Thread{
    public _02_ThreadA(){
        setName("ThreadA");
    }

    public void run(){
        for (int i = 0; i < 2; i++){
            System.out.println(getName() + " is printing.");
        }
    }
}
