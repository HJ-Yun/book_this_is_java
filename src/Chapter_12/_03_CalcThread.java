package Chapter_12;

public class _03_CalcThread extends Thread{
    public _03_CalcThread(String name){
        setName(name);
    }
    public void run(){
        for (int i = 0; i< 2000000000; i++){
        }
        System.out.println(getName());
    }
}
