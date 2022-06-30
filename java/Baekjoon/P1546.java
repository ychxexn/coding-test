import java.util.Scanner;
public class P1546{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<N; i++){
            scores[i] = sc.nextInt();
            max = Math.max(max, scores[i]);
            sum += scores[i];
        }
        
        System.out.println((double)sum / max * 100 / N);
    }
}