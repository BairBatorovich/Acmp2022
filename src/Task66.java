import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter(new File("output.txt"));
        String result = "123";
        String[] massiv = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
                "a", "s", "d", "f", "g", "h", "j", "k", "l",
                "z", "x", "c", "v", "b", "n", "m"};
        String b = scanner.nextLine();

        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i].equals(b)) {
                if( i == 25) {
                    result = massiv[0];
                    break;
                } else {
                    int index = i + 1;
                    result = massiv[index];
                    break;
                }
            } else continue;
        }

        printWriter.print(result);
        printWriter.close();
    }
}
