/*
 * FromBinary.java
 *
 * Created on January 29, 2007, 8:45 PM
 *
 * Solution to Project 6
 * and open the template in the editor.
 */

/**
 *
 * @author charleshoot
 */

import java.util.Scanner;
public class FromBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a four bit binary value.");

        String binary = keyboard.next();

        String bit0 = binary.substring(0, 1);
        String bit1 = binary.substring(1, 2);
        String bit2 = binary.substring(2, 3);
        String bit3 = binary.substring(3, 4);

        int b0 = Integer.parseInt(bit0);
        int b1 = Integer.parseInt(bit1);
        int b2 = Integer.parseInt(bit2);
        int b3 = Integer.parseInt(bit3);

        int value = b0*8 + b1*4 + b2*2 + b3;


        System.out.println("The value of " + binary + " is " + value);

        keyboard.close();
    }

}
