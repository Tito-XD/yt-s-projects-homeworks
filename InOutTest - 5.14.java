import java.io.*;

public class InOutTest {
    public static void main(String[] args) throws Exception {
        FileWriter text = new FileWriter("1.txt");
        text.write("这是Java实验课程，实验内容为I/O输入输出流");
        text.close();

        File f1 = new File("1.txt");
        File f2 = new File("2.txt");

        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);

        int n = 0;
        byte[] b = new byte[10];
        while ((n = in.read(b, 0, 10)) != -1) {
            String s = new String(b, 0, n);
            System.out.println(s);
            out.write(b, 0, n);
        }
        out.close();
        in.close();
    }
}