import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task539 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int g = scanner.nextInt();
        if(g > 1){
            if(g%2==0){
                printWriter.print(g/2);
            } else {
                printWriter.print(g);
            }
        } else {
            printWriter.print(0);
        }
        printWriter.close();
    }
}
