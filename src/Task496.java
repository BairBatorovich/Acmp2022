import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task496 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int d = scanner.nextInt();
        int[] m = new int[d+2];
        int maxsum = 0;

        for (int i = 0; i < d; i++) {
            m[i] = scanner.nextInt();
        }
        m[d] = m[0];
        m[d+1] = m[1];
        for (int i = 1; i < d+1; i++) {
            int t = m[i-1]+m[i]+m[i+1];
            if(maxsum < t) maxsum = t;
        }
        printWriter.print(maxsum);
        printWriter.close();
    }
}
