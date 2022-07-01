import java.util.Scanner;
import java.util.Arrays;
public class P1940 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] objArr = new int[len];
        int N = sc.nextInt();
        int count = 0;

        for(int i=0; i<len; i++){
            objArr[i] = sc.nextInt();
        }

        Arrays.sort(objArr);
        for(int start=0, end=len-1; start < end; ){
            int sum = objArr[start] + objArr[end];
            if(sum == N){
                count++;
                start++;
                end--;
            }else if(sum < N){
                start++;
            }else{
                end--;
            }
        }

        System.out.println(count);
    }
}
