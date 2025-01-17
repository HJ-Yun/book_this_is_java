package chapter_18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _15_DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/text.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("Mark");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("Nick");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush(); dos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/text.txt");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 2; i++){
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }
        dis.close(); fis.close();
    }
}
