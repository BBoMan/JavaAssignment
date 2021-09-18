package practice.chap3;

import java.util.Scanner;

public class Prac14 {
    public static void main(String[] args) {
        String course [] = {"Java", "C++",  "HTML5", "ComputerStructure", "android"};
        int score [] = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        String name;
        int count = 0;

        while(true){
            count = 0;
            System.out.print("subject name>>");
            name = scanner.next();
            if(name.equals("stop"))
                break;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    System.out.println(course[i] + " score is " + score[i]);
                    break;
                }
                else
                    count++;
            }
            if(count == 5)
                System.out.println("excepted subject");
        }
    }
}
