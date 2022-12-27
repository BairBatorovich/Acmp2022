import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task692 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int a = scanner.nextInt();

        if(a <= 10000) {
            while ( a > 0 && a%2 ==0 && a != 1) {
                a /=2;
            }
            printWriter.print(a == 1 ? "YES" : "NO");
            printWriter.close();
        }
    }
}
