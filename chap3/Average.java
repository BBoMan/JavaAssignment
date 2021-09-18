package practice.chap3;

public class Average {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        int sum = 0;
        for(int i=0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum / args.length);
    }
}
