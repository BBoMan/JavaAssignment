package practice.chap2;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {

		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner interger = new Scanner(System.in);
		int score = interger.nextInt();
		
		if(score%10 == score/10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		
		interger.close();
		

	}

}
