import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task697 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        DecimalFormat format = new DecimalFormat("#");

        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        double s = 2*(l*h) + 2*(w*h);
        double kb = Math.ceil(s /16);
        String x = format.format(kb);

        printWriter.print(s <= 16 ? 1 : x);
        printWriter.close();
    }
}
