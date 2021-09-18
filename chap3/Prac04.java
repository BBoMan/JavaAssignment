package practice.chap3;

import java.util.Scanner;

public class Prac04 {
    public static void main(String[] args) {

        System.out.print("press one small spellinge>>");
        Scanner scanner =  new Scanner(System.in);
        String s = scanner.next();
        char c = s.charAt(0);

        for(int i = 0;i < c-96;i++){
            for(int j = 0;j < c-96-i;j++){
                char m = (char)(97+j);
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
