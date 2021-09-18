package practice.chap3;

import java.util.Random;
import java.util.Scanner;

public class Prac08 {
    public static void main(String[] args) {
        System.out.print("How much integer?>>");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int random = 0;
        int result = 1;

        for(int i=0;i<n;i++){
            random = rand.nextInt(100)+1;
            for(int j=0;j<i;j++){
                if(random == arr[j]){
                    result = 0;
                    //System.out.print("fail ");
                    break;
                }
                else
                    result = 1;
            }

            if(result == 1) {
                arr[i] = random;
            }
            else
                i--;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
            if ((i+1) % 10 == 0)
                System.out.println();
        }

    }
}