import java.util.Arrays;
import java.util.Scanner;
public class P1037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numArr = new int[length];

        for(int i=0; i<length; i++){
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);

        System.out.println(numArr[0] * numArr[length-1]);
    }
}
