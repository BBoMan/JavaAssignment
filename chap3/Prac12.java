package practice.chap3;

public class Prac12 {
    public static void main (String[] args) {
        int i=0, count=0, sum=0;
        int integer[] = new int[5];

        for(i=0;i<args.length;i++){
            try{
                int j = Integer.parseInt(args[i]);
                integer[count] = j;
                count++;
            }
            catch(NumberFormatException e){
            }
        }
        for(i=0;i<count;i++){
            sum = sum+integer[i];
        }

        System.out.println(sum);
    }
}
