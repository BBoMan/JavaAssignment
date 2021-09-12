package practice.chap2;

import java.util.Scanner;

public class Prac04 {

	public static void main(String[] args) {
		
		int middle = 0;
		
		// TODO Auto-generated method stub
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		
		if((first > second && first < third) || (first < second && first > third))
			middle = first;
		else if((second > first && second < third) || (second < first && second > third))
			middle = second;
		else if((third > second && third < first) || (third < second && third > first))
			middle = third;
		
		System.out.println("중간 값은 " + middle );
		
		scanner.close();
	}

}
