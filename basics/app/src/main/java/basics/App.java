/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        //pluralize Test
        int dogCount = 5;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        // flipNHeads Test
        flipNHeads(2);

        // colck Test
        clock();
    }


    public static String pluralize(String word, int number) {
        String result = "";
        if (number == 1) { result = word; }
        else if (number == 0 || number > 1) { result = word + "s"; }

        return result;
    }

    public static void flipNHeads(int n) {

        int flips = 0, countHead = 0;
        if (n < 0) { System.out.println("Error"); }

        else {
            while (countHead != n)
            {
                double ranNumber = Math.random();
//                System.out.println(ranNumber);
                if (ranNumber > 0.5) {
                    System.out.println("heads");
                    countHead++;
                    flips++;
                }
                if (ranNumber < 0.5) {
                    System.out.println("tails");
                    countHead = 0;
                    flips++;
                }
            }
            System.out.println("It took " + flips + " flips to flip " + countHead + " heads in a row.");
        }
    }

    public static void clock() {
        int  million = 1_000_000;
        double count = 0.0;
        String time = "";

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (!currentTime.equals(time)) {
                time = currentTime;
                System.out.println(time + "  " + count/million + " MHz");
                count = 0.0;
            }

            count++;
        }
    }
}