package OOPs_Factory;
import java.util.Scanner;
public class guessTheNumber {
    public static void main(String[] args) {
        int consoleWidth = 80;
        char[] row = new char[consoleWidth];
        int range = consoleWidth - 1;
        int position = 0;

        while (true) {

            for (int i = 0; i < consoleWidth; i++) {
                row[i] = ' ';
            }


            row[position] = '#';


            System.out.print("\r" + new String(row));


//            try {
//                Thread.sleep(100); // Adjust the sleep time for the desired speed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


            position = (position + 1) % range;
        }
    }
}
