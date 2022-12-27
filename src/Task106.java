import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task106 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int d = scanner.nextInt();
        int[] m = new int[d];
        int ed = 0;
        int nol = 0;
        for (int i = 0; i < d; i++) {
            m[i] = scanner.nextInt();
        }

        for (int i = 0; i < m.length; i++) {
            if(m[i] == 1) {
                ed++;
            } else {
                nol++;
            }
        }
        if(ed < nol) printWriter.print(ed);
        else printWriter.print(nol);

        printWriter.close();
    }
}
