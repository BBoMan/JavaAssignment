package practice.chap2;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {

		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner interger = new Scanner(System.in);
		int score = interger.nextInt();
		
		if(score%10 == score/10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		
		interger.close();
		

	}

}
