import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) throws IOException {
        new Task03().run();
    }
    Scanner sc;
    PrintWriter pw;
    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        long result = 0;

        if (n % 10 == 5 && n <= 400000) {
            result = (long) Math.pow(n, 2);
            pw = new PrintWriter(new File("output.txt"));
            pw.print(result);
            pw.close();
        }
    }
}
