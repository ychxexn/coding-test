import java.util.ArrayList;
import java.util.Scanner;
public class P11724{
    private static ArrayList<Integer>[] list;
    private static boolean[] isVisited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nodeLength = sc.nextInt();
        int edgeLength = sc.nextInt();
        int count = 0;

        list = new ArrayList[nodeLength + 1];
        isVisited = new boolean[nodeLength + 1];

        for(int i=1; i<=nodeLength; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<edgeLength; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            list[start].add(end);
            list[end].add(start);
        }

        for(int i=1; i<=nodeLength; i++){
            if(!isVisited[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    public static void DFS(int num){
        if(isVisited[num]){
            return;
        }
        isVisited[num] = true;
        for(int i=0; i<list[num].size(); i++){
            DFS(list[num].get(i));
        }
    }
}