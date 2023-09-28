/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {

    public void run() {
        System.out.println("----Start Game----");
        Random random = new Random();
        boolean repeat = true;
        do {
            int myNumber = random.nextInt(9-0+1)-0;
            System.out.print("Задумано число в диапазоне от 0 до 9, угадайте какое это число (у вас есть три попытки): ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();scanner.nextLine();
            if (myNumber == userNumber) {
                System.out.println("Ты выйграл!");          
            } else {
                System.out.println("Ты проиграл!");
                System.out.println("Было загадано число " + myNumber);
            }
            System.out.println("Нажмите \"q\" для выхода или любую кнопку для продолжения");
            String q = scanner.nextLine();
            if (q.equals("q")) {
                repeat = false;
            }
        }while (repeat);
        System.out.println("----End Game----");
    }
    
}
