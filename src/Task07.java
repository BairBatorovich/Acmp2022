import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        Scanner sc = new Scanner(new File("input.txt"));
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        pw.close();
    }
}
