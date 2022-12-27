import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task504 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int d = scanner.nextInt();
        String[] c = {"G", "C", "V"};

        for (int i = 1; i <= d; i++) {
            String[] temp = new String[c.length];

            temp[0] = c[0];
            temp[1] = c[2];
            temp[2] = c[1];

            String t = temp[0];

            temp[0] = temp[1];
            temp[1] = t;
            temp[2] = temp[2];;
            c = temp;
        }
        printWriter.print(c[0]+c[1]+c[2]);
        printWriter.close();
    }
}
