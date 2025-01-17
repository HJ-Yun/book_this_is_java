package chapter_11;

import java.util.Properties;
import java.util.Set;

public class _16_GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("OS name : " + osName);
        System.out.println("user name : " + userName);
        System.out.println("User home : " + userHome);

        System.out.println("---------------------------");
        System.out.println("[key] value");
        System.out.println("---------------------------");
        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object objKey : keys){
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("[" + key + "] " + value);
        }

    }
}
