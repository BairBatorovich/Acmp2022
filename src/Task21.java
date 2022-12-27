import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int a, b, c, max, min;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        max=min=0;
        if( a>=0 && b>0 && c>=0 && a<=100000 && b<=100000 && c<=100000 ) {
            if ( a >= b && a >= c) max = a;
            else if (b > c ) max = b;
            else max = c;
            if ( a <= b && a <= c) min = a;
            else if (b < c ) min = b;
            else min = c;
            printWriter.print(max-min);
            printWriter.close();
        }
    }
}
