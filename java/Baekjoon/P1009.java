import java.util.Scanner;
public class P1009{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int examLength = sc.nextInt();
        for(int i=0; i<examLength; i++){
            int base = sc.nextInt();
            int power = sc.nextInt() % 4 + 4;
            
            long result = (long)Math.pow(base, power) % 10;
            System.out.println(result == 0 ? 10 : result);
        }
    }
}