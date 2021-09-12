package practice.chap2;

import java.util.Scanner;

public class Prac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, c = 0;
		String b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		
		a = scanner.nextInt();
		b = scanner.next();
		c = scanner.nextInt();
		
		if(b.equals("+"))
			System.out.println(a + b + c + "의 결과는 " + (a+c));
		else if(b.equals("-"))
			System.out.println(a + b + c + "의 결과는 " + (a-c));
		else if(b.equals("*"))
			System.out.println(a + b + c + "의 결과는 " + (a*c));
		else if(b.equals("/"))
			System.out.println(a + b + c + "의 결과는 " + (a/c));
		else
			System.out.println("잘못된 연산자를 사용하셨습니다.");
		
		
		/*
		switch (b) {
			case "+":
				System.out.println(a + b + c + "의 결과는 " + (a+c));
				break;
			case "-":
				System.out.println(a + b + c + "의 결과는 " + (a-c));
				break;
			case "*":
				System.out.println(a + b + c + "의 결과는 " + (a*c));
				break;
			case "/":
				System.out.println(a + b + c + "의 결과는 " + (a/c));
				break;
			default:
				System.out.println("잘못된 연산자를 사용하셨습니다.");
			}
		
		*/
		scanner.close();
	}

}
