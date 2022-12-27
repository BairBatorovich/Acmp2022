import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) throws IOException {
        new Task02().run();
    }
    Scanner sc;
    PrintWriter pw;
    public void run() throws IOException {
        int sum = 0;
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));

        int n = sc.nextInt();

        if(n <= 10000 && n >= -10000) {
            if(n > 0) {
                sum = n * (n + 1) / 2;
            } else  {
                sum = -n * (n - 1) / 2 + 1;
            }
        }

        pw.print(sum);
        pw.close();
    }
}
