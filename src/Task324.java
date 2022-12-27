import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task324 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));

        String a = scanner.nextLine();
        String b = new StringBuilder(a).reverse().toString();

        if(a.equals(b)) {
            printWriter.print("YES");
        } else printWriter.print("NO");
        printWriter.close();
    }
}
