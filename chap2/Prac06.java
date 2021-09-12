package practice.chap2;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int samukgu = scanner.nextInt();
		int count = 0;
		
		if(samukgu%10 == 3 || samukgu%10 == 6 || samukgu%10 == 9)
			count++;
		
		if(samukgu/10 == 3 || samukgu/10 == 6 || samukgu/10 == 9)
			count++;
		
		if(count == 2)
			System.out.println("박수짝짝");
		else if(count == 1)
			System.out.println("박수짝");
		else
			System.out.println("없음");
		
		scanner.close();
	}

}
