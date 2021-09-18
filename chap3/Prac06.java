package practice.chap3;

import java.util.Scanner;

public class Prac06 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int total = 0, each = 0, extra = 0;
        System.out.print("input total money>>");
        Scanner scanner = new Scanner(System.in);
        total = scanner.nextInt();

        each = total;
        extra = total;
        for (int i = 0; i < unit.length; i++) {
            each = extra / unit[i];
            extra = extra % unit[i];
            if(each > 0)
            System.out.println(unit[i] + "won : " + each);
        }
    }
}