import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task970 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if( a + b == c) {
            printWriter.print("YES");
        } else if (a + c == b) {
            printWriter.print("YES");
        } else if (b + c == a) {
            printWriter.print("YES");
        } else {
            printWriter.print("NO");
        }

        printWriter.close();
    }
}
