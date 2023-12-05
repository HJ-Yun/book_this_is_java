package Chapter_12;

public class _02_ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Current Thread name : " + mainThread.getName());

        _02_ThreadA threadA = new _02_ThreadA();
        System.out.println("ThreadA : " + threadA.getName());
        threadA.start();

        _02_ThreadB threadB = new _02_ThreadB();
        System.out.println("ThreadB : " + threadB.getName());
        threadB.start();
    }
}
