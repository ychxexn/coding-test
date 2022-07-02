/***
 * 시간초과, 나중에 다시 풀 것
 */
import java.util.Scanner;
public class P12891{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dnaStrLength = sc.nextInt();
        int pwdLength = sc.nextInt();
        String dnaStr = sc.next();

        int ACount = sc.nextInt();
        int CCount = sc.nextInt();
        int GCount = sc.nextInt();
        int TCount = sc.nextInt();

        int start = 0;
        int end = start + pwdLength;
        int count = 0;
        while(end < dnaStrLength){
            if(dnaStrLength - dnaStr.replaceAll("A", "").length() >= ACount
            && dnaStrLength - dnaStr.replaceAll("C", "").length() >= CCount
            && dnaStrLength - dnaStr.replaceAll("G", "").length() >= GCount
            && dnaStrLength - dnaStr.replaceAll("T", "").length() >= TCount){
                count++;
            }
            start++;
            end++;
        }

        System.out.println(count);
    }
}