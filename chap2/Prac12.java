package practice.chap2;

import java.util.Scanner;

public class Prac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, c = 0;
		String b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>>");
		
		a = scanner.nextInt();
		b = scanner.next();
		c = scanner.nextInt();
		
		if(b.equals("+"))
			System.out.println(a + b + c + "�� ����� " + (a+c));
		else if(b.equals("-"))
			System.out.println(a + b + c + "�� ����� " + (a-c));
		else if(b.equals("*"))
			System.out.println(a + b + c + "�� ����� " + (a*c));
		else if(b.equals("/"))
			System.out.println(a + b + c + "�� ����� " + (a/c));
		else
			System.out.println("�߸��� �����ڸ� ����ϼ̽��ϴ�.");
		
		
		/*
		switch (b) {
			case "+":
				System.out.println(a + b + c + "�� ����� " + (a+c));
				break;
			case "-":
				System.out.println(a + b + c + "�� ����� " + (a-c));
				break;
			case "*":
				System.out.println(a + b + c + "�� ����� " + (a*c));
				break;
			case "/":
				System.out.println(a + b + c + "�� ����� " + (a/c));
				break;
			default:
				System.out.println("�߸��� �����ڸ� ����ϼ̽��ϴ�.");
			}
		
		*/
		scanner.close();
	}

}
