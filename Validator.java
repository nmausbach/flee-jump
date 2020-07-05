/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mausbachfinal;

/**
 *
 * @author njmau
 */
import java.util.Scanner;
/**
 *
 * @author njmau
 */
public class Validator {
            
    public static int getInt(Scanner sc, String prompt) {
      boolean isValid = false;
        int i = 0;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.\n");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;
        int randomInt = (int) d;
        randomInt++;
        return randomInt;
    }
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
      int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                    "Error! Number must be greater than " + min);
            else if (i > max)
                System.out.println(
                    "Error! Number must be less than " + max);
            else
                isValid = true;
        }
        return i;
    }
    public static double getDoubleWithinRange(Scanner sc, String prompt,
            double min, double max) {
      double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d < min)
                System.out.println(
                    "Error! Number must be greater than " + min);
            else if (d > max)
                System.out.println(
                    "Error! Number must be less than " + max);
            else
                isValid = true;
        }
        return d;
    }
    public static double getDouble(Scanner sc,
            String prompt) {
      boolean isValid = false;
        double d = 0;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
public static String getLine(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next();        // read the first string on the line
        sc.nextLine();               // discard the rest of the line
        return s;
    }
}