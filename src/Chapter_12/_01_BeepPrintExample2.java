package Chapter_12;

public class _01_BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new _01_BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}
