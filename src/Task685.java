import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task685 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int sum = 0;
        int[] a = new int[3];
        int[] b = new int[3];

        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();

        b[0] = scanner.nextInt();
        b[1] = scanner.nextInt();
        b[2] = scanner.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        sum = a[0]*b[0] + a[1]*b[1] + a[2]*b[2];

        printWriter.print(sum);
        printWriter.close();
    }

}
