import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task754 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();

        int max = Math.max(m1, Math.max(m2,m3));
        int min = Math.min(m1, Math.min(m2,m3));
        if(min < 94 || max > 727) {
            printWriter.print("Error");
        } else {
            printWriter.print(max);
        }
        printWriter.close();
    }
}
