package practice.chap2;

import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1  = 0, y1 = 0, r1 = 0, x2 = 0, y2 = 0, r2 = 0;
		int lengh = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		r1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		r2 = scanner.nextInt();
		
		lengh = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		
		if(lengh <= (r1+r2)*(r1+r2))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		scanner.close();
	}

}
