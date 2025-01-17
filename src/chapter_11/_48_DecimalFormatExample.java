package chapter_11;

import java.text.DecimalFormat;

public class _48_DecimalFormatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0000000000.0000000000");
        System.out.println(df.format(num));

        df = new DecimalFormat("#");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.#");
        System.out.println(df.format(num));

        df = new DecimalFormat("########.###########");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("+#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("-#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(num));

        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.# %");
        System.out.println(df.format(num));

        df = new DecimalFormat("\u00A4 #,###");
        System.out.println(df.format(num));
    }
}
