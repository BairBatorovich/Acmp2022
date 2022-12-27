import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task05 {
    public static void main(String[] args) throws IOException {
        new Task05().run();
    }
    Scanner sc;
    PrintWriter pw;
    public void run() throws IOException {
        String request = "";
        String chet = "";
        String nechet = "";
        int kolChet = 0;
        int kolNechet = 0;

        sc = new Scanner(new File("input.txt"));
        int a = parseInt(sc.nextLine());
        String b = sc.nextLine();
        String strArr[] = b.split(" ");


        if(a >= 1 && a <= 100) {

            int[] numArr = new int[a];
            for(int i = 0; i < strArr.length; i++) {
                numArr[i] = parseInt(strArr[i]);
            }
            for(int i = 0; i < numArr.length; i++) {
                if(numArr[i] >= 1 && numArr[i] <= 31){
                    if(numArr[i]%2 == 0) {
                        kolChet++;
                        chet = chet + numArr[i] + " ";
                    } else {
                        kolNechet++;
                        nechet = nechet + numArr[i] + " ";
                    }
                }
            }

            if(kolChet >= kolNechet) {
                request = "YES";
            } else {
                request = "NO";
            }
            pw = new PrintWriter(new File("output.txt"));
            pw.println(nechet);
            pw.println(chet);
            pw.print(request);
            pw.close();
        } else {
            System.out.print("вне диапазона");
        }

    }
}