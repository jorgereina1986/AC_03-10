package nyc.c4q.jorgereina1986;

import java.util.Scanner;

/**
 * Created by jorge and allison on 3/10/15.
 */
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        for (int i = 1; i <= 100; i++) {



            if (i % 3 == 0 &&  i % 5 == 0) {
                System.out.println("FizzBuzz");

            }

            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if ( i % 3 == 0 ){
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }


        }
    }
}
