package practice.chap2;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		int samukgu = scanner.nextInt();
		int count = 0;
		
		if(samukgu%10 == 3 || samukgu%10 == 6 || samukgu%10 == 9)
			count++;
		
		if(samukgu/10 == 3 || samukgu/10 == 6 || samukgu/10 == 9)
			count++;
		
		if(count == 2)
			System.out.println("�ڼ�¦¦");
		else if(count == 1)
			System.out.println("�ڼ�¦");
		else
			System.out.println("����");
		
		scanner.close();
	}

}
