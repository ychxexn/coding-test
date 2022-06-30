import java.util.Scanner;
public class P11659{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dataLen = sc.nextInt();
        int qstLen = sc.nextInt();
        int[] dataArr = new int[dataLen];
        int[] sumArr = new int[dataLen + 1];
        
        for(int i=0; i<dataLen; i++){
            dataArr[i] = sc.nextInt();
            sumArr[i + 1] = sumArr[i] + dataArr[i];
        }
        
        for(int i=0; i<qstLen; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            System.out.println(sumArr[end] - sumArr[start-1]);
        }
    }
}