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
public class FinalProject {
    public static void main (String args[]) {
        Scanner get = new Scanner(System.in);
        
        int menu;//initialize menu
        
        MausbachHeading.getHeader("Final");//first heading
        menu = FinalMenu.Menu(1);
        while (menu != 2){//start of loop
            System.out.println("\n"); 
        if (menu == 1){
            MausbachHeading.getHeader("Final");//repeating heading
            String prompt = "Enter the number of bell rings (range 1-100,000): ";
            int rings = Validator.getInt(get, prompt);

        for (int i = 0; i < rings; i ++) {
            Grid test1 = new Grid(rings);
            test1.ringBells();
        }
        menu = FinalMenu.Menu(2);
        if (menu == 2){
        System.out.println("\nThank You for Playing");
        }
        }
    }
}
}
