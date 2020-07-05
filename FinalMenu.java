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
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author njmau
 */
public class FinalMenu {
    public static int Menu(int num){
        Scanner get = new Scanner(System.in);
        int menu;
int idiotCounter = 0;
        while(idiotCounter < 3){
           try{ System.out.println("\n\tFlea Jumping Menu\n\nChoose your option number\n");
                System.out.println("Option 1. Play my game: ");//validate required
            if (num == 2)
                System.out.println("Option 2. Exit: ");//exit option
                String w = "Enter your choice. ";//prompt
                menu = Validator.getInt(get, w);
                }//error catch
                catch (InputMismatchException e){
                    System.out.println(" \n\tError! Invalid number. Try again. \n\t" + e);
                    get.nextLine();
                   System.out.println("idiot counter is " +idiotCounter);
                   //Validator.getLine(get, c);
                   idiotCounter++;
                    continue;
                }
            switch(menu){//switch menu
                case 1:
                    return menu;
                case 2:
                    return menu;
                default:
                    idiotCounter++;//counter
            }
        }
        menu = 2;
        return menu;
    }
}
