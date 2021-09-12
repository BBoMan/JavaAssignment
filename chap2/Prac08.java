package practice.chap2;

import java.util.Scanner;

public class Prac08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, 
			int rectx2, int recty2) {
	if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
		return true;
	else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		
		System.out.print("직사각형을 구성하는 두 점 x1, y1, x2, y2를 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		boolean a = false, b = false, c = false, d = false, e = false, f = false,
				g = false, h = false;
		
		a = inRect(x1, y1, 100, 100, 200, 200);
		b = inRect(x1, y2, 100, 100, 200, 200);
		c = inRect(x2, y1, 100, 100, 200, 200);
		d = inRect(x2, y2, 100, 100, 200, 200);
		
		e = inRect(100, 100, x1, y1, x2, y2);
		f = inRect(100, 200, x1, y1, x2, y2);
		g = inRect(200, 100, x1, y1, x2, y2);
		h = inRect(200, 200, x1, y1, x2, y2);

		if(a || b || c || d || e || f || g || h)
			System.out.println("충돌");
		else
			System.out.println("충돌 안함");
		
		scanner.close();
	}

}
