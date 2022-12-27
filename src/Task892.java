import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task892 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        int m = scanner.nextInt();

        switch (m) {
            case 1:
                printWriter.print("Winter");
                break;
            case 2:
                printWriter.print("Winter");
                break;
            case 3:
                printWriter.print("Spring");
                break;
            case 4:
                printWriter.print("Spring");
                break;
            case 5:
                printWriter.print("Spring");
                break;
            case 6:
                printWriter.print("Summer");
                break;
            case 7:
                printWriter.print("Summer");
                break;
            case 8:
                printWriter.print("Summer");
                break;
            case 9:
                printWriter.print("Autumn");
                break;
            case 10:
                printWriter.print("Autumn");
                break;
            case 11:
                printWriter.print("Autumn");
                break;
            case 12:
                printWriter.print("Winter");
                break;
            default:
                printWriter.print("Error");
                break;
        }
        printWriter.close();
    }
}
