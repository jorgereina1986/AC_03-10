package nyc.c4q.jorgereina1986;

import java.util.Scanner;

/**
 * Created by Allison and Jorge  on 3/10/15.
 */
public class countingRev {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("count from: ");
        int from = keyboard.nextInt();
        System.out.println("count to: ");
        int to = keyboard.nextInt();
        System.out.println("count by: ");
        int by = keyboard.nextInt();

        for (int i = from; i <= to; i = i + by) {
            System.out.println(i);
        }
    }
}
