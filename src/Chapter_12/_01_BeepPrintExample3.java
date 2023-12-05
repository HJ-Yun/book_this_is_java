package Chapter_12;

public class _01_BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new _01_BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }
    }
}
