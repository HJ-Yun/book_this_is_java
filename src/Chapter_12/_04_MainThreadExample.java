package Chapter_12;

public class _04_MainThreadExample {
    public static void main(String[] args) {
        _04_Calculator calculator = new _04_Calculator();

        _04_User1 user1 = new _04_User1();
        user1.setCalculator(calculator);
        user1.start();

        _04_User2 user2 = new _04_User2();
        user2.setCalculator(calculator);
        user2.start();

    }
}
