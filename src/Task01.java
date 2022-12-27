import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) throws IOException {
        new Task01().run();
    }
    Scanner sc;
    PrintWriter pw;
    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int a=sc.nextInt(), b=sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));
        pw.print(a+b);
        pw.close();
    }
}
