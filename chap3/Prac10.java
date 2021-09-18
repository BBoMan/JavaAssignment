package practice.chap3;

import java.util.Random;

public class Prac10 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Random rand = new Random();
        int row = 0, col = 0, value = 0, seat = 10;

        for(int i=0;i<4;i++){       //초기화
            for(int j=0;j<4;j++){
                arr[i][j]=0;
            }
        }

        while(true){        //배열
            row = rand.nextInt(4);
            col = rand.nextInt(4);
            value = rand.nextInt(10)+1;

            if(seat == 0)       //10개 삽입 후 종료
                break;

            if(arr[row][col] == 0) {        //임의의 공간이 0일 때만 삽입
                arr[row][col] = value;
                seat--;
            }
        }

        for(int i=0;i<4;i++){       //출력
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
