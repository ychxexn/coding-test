import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        int num = 1;
        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            if(!list.contains(A[i])){
                list.add(A[i]);
            }
        }

        for(int i=0; i<list.size(); i++, num++){
            if(list.get(i) != num){
                break;
            }
        }

        return num;
    }
}
