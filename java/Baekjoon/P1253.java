import java.util.Scanner;
import java.util.Arrays;
public class P1253 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        int count = 0;
        
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<len; i++){
            int K = arr[i];
            int start = 0;
            int end = len - 1;
            while(start < end){
                if(start == i){
                    start++;
                    continue;
                }
                if(end == i){
                    end--;
                    continue;
                }
                int sum = arr[start] + arr[end];
                if(sum == K){
                    count++;
                    start++;
                    end--;
                    break;
                }else if(sum < K){
                    start++;
                }else{
                    end--;
                }
            }
        }

        System.out.println(count);
    }
}
