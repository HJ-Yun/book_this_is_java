package Chapter_12;

public class _04_User2 extends Thread{
    private _04_Calculator calculator;
    public void setCalculator(_04_Calculator calculator){
        this.setName("User2");
        this.calculator = calculator;
    }
    public void run(){
        calculator.setMemory(50);
    }
}
