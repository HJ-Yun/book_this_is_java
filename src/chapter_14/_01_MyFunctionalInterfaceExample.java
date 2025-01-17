package chapter_14;

public class _01_MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        _01_MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();
    }
}
