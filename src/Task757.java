import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task757 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        long c = scanner.nextLong();
        long h = scanner.nextLong();
        long o = scanner.nextLong();

        if( c >= 2 && h >= 6 && o >= 1) {
            if( 0 < c && o < h) {
                System.out.println();
            }
        } else {
            printWriter.print(0);
        }
        printWriter.close();
    }
}
