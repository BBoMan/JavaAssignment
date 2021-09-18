package practice.chap3;

import java.util.Random;
import java.util.Scanner;

public class Prac16 {
    public static void main(String[] args) {
        String str[] = {"scissors", "rock", "paper"};
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's start game with computer.");
        System.out.print("scissors rock paper!>>");

        while(true) {
            String choice = scanner.next();
            int n = rand.nextInt(3);

            if (str[n].equals(choice))
                System.out.println("user = " + choice + " , computer + " + choice + ", draw");

            else if (str[(n + 1) % 3].equals(choice))
                System.out.println("user = " + choice + " , computer + " + str[(n + 2) % 3] + ", lose");

            else if (str[(n + 2) % 3].equals(choice))
                System.out.println("user = " + choice + " , computer + " + str[(n + 1) % 3] + ", win");

            else if (choice.equals("stop"))
                break;
            else
                System.out.println("Error");
        }
        System.out.println("Stop The Game...");
    }
}
