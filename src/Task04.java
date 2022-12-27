import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task04 {
    public static void main(String[] args) throws IOException {
        new Task04().run();
    }
    Scanner sc;
    PrintWriter pw;
    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        int a = sc.nextInt();
        pw = new PrintWriter(new File("output.txt"));


        int x = 9 - a;
        pw.print(a);
        pw.print(9);
        pw.print(x);
        pw.close();
    }
}