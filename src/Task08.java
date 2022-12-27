import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        Scanner sc = new Scanner(new File("input.txt"));
        int a1,a2,a3,a4, b1,b2,b3,b4;
        int a, b;
        a1=sc.nextInt();
        b1=sc.nextInt();

        a2=sc.nextInt();
        b2=sc.nextInt();

        a3=sc.nextInt();
        b3=sc.nextInt();

        a4=sc.nextInt();
        b4=sc.nextInt();

        a = a1+a2+a3+a4;
        b = b1+b2+b3+b4;

        if(a > b) {
            pw.print(1);
            pw.close();
        } else if(a == b) {
            pw.print("DRAW");
            pw.close();
        } else {
            pw.print(2);
            pw.close();
        }
    }
}
