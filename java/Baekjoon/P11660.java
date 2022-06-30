import java.util.Scanner;
public class P11660{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int dataLen = sc.nextInt();
        int qstLen = sc.nextInt();
        
        int[][] dataArr = new int[dataLen+1][dataLen+1];
        int[][] sumArr = new int[dataLen+1][dataLen+1];
        
        for(int i=0; i<dataLen; i++){
            for(int j=0; j<dataLen; j++){
                dataArr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=1; i<=dataLen; i++) {
        	for(int j=1; j<=dataLen; j++) {
        		sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1] + dataArr[i-1][j-1];
        	}
        }
        
        for(int i=0; i<qstLen; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            System.out.println(sumArr[x2][y2] - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1]);
        }
    }
}