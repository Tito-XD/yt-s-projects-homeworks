import java.io.*;

public class Score {
    public static void main(String[] args) throws Exception {

        FileReader in = new FileReader("score.txt");
        BufferedReader bfdin = new BufferedReader(in);

        FileWriter writer = new FileWriter("scorenew.txt");
        BufferedWriter bfdwriter = new BufferedWriter(writer);

        String str = "";
        int n = 1;
        while ((str = bfdin.readLine()) != null) {
            String str1 = "序号:" + n + " " + str;
            n++;
            System.out.println(str1);
            bfdwriter.write(str1);
            bfdwriter.newLine();
        }
        bfdwriter.close();
        writer.close();
        bfdin.close();
        in.close();
    }

}