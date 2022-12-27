import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task907 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int r = scanner.nextInt();
        if(w >= r*2 && h >= r*2) printWriter.print("YES");
        else printWriter.print("NO");
        printWriter.close();
    }
}
