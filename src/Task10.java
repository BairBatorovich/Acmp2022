import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        int a,b,c,d,e;
        e =32768;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if(a != 0 && b <= e && c <= e && d <= e) {
            for (int i = -100; i <= 100; i++) {
                for (int j = -100; j <= 100; j++) {
                    for (int k = -100; k <= 100; k++) {
                        if( (a*i^3 + b*j^2 + c*k + d) == 0) {
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(k);
                            break;
                        }
                    }
                }
            }
        }
    }
}
