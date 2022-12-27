import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task819 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long p = 0, v = 0;
        if(a > 0 && b > 0 && c > 0) {
            p = 2 * ( a*b + a*c + b*c);
            v = a * b * c;
        }
        printWriter.print(p + " " + v);
        printWriter.close();
    }
}
