import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int d = scanner.nextInt();
        int[] m = new int[d];

        int maxId = 0;
        int minId = 0;
        int sum = 0;
        int proizvedeine = 1;

        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
        int min = m[0];
        int max = m[0];

        for (int i = 0; i < m.length; i++) {
            if(m[i] > 0) {
                sum = sum + m[i];
            }
            if(min > m[i]) {
               min = m[i];
               minId = i;
            }
            if(max < m[i]) {
               max = m[i];
               maxId = i;
            }
        }
        if(minId < maxId) {
            for (int i = minId+1; i < maxId; i++) {
                proizvedeine = proizvedeine * m[i];
            }
        } else {
            for (int i = maxId+1; i < minId; i++) {
                proizvedeine = proizvedeine * m[i];
            }
        }

        System.out.println(sum + "\n" + proizvedeine);

        printWriter.print(sum + " " + proizvedeine);
        printWriter.close();

    }
}
