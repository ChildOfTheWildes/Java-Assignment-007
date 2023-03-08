/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class MyMath {

    public static void gcf () {

        // Declares and initializes variables
        int fn = 0;
        int sn = 0;
        int bn = 0;
        int smn = 0;
        int r = 0;

        try {
            System.out.println("Enter a number: "); // Asks for user input

            fn = in.nextInt(); // Assigns user input as first number (fn)

            System.out.println("Enter a number: "); // Asks for user input

            sn = in.nextInt(); // Assigns user input as second number (sn)

        } catch (Exception e) { // Catches bad input and terminates
            System.out.println("Bad input");
            System.exit(0);
        }
        //System.out.println("First number is: " + fn);
        //System.out.println("Second number is: " + sn);

        // Determines which number is bigger/smaller and assigns that number to either
        // bigger number (bn), or smaller number (smn)
        if (fn > sn) {
            smn = sn;
            bn = fn;
        } if (fn < sn) {
            smn = fn;
            bn = sn;
        }


        //System.out.println("The smaller number is: " + smn);
        //System.out.println("The bigger number is: " + bn);

/* With r starting initialized to the remainder (r). The remainder must be greater than 0.
Every iteration the remainder becomes the smaller number and is determined by finding the remainder of
the smaller number subtracted from the bigger number (mod). On every iteration the smaller number
becomes the bigger number*/
        for (r = smn; r > 0; smn = r) {
            r = bn % smn;
            bn = smn;
            //System.out.println(r);
        }


        //System.out.println(r);
        //System.out.println(bn);

        // Outputs the results
        System.out.printf("The greatest common factor of %s, and %s, is %s,", fn, sn, bn);

    }

    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        gcf();

    }
}
