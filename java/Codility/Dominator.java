import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] A) {
        Map<Integer, List> hashMap = new HashMap<Integer, List>();

        List temp = null;
        for(int i=0; i<A.length; i++){
            if(hashMap.containsKey(A[i])){
                temp = hashMap.get(A[i]);
            }else{
                temp = new ArrayList();
            }
            temp.add(i);
            hashMap.put(A[i], temp);
        }

        for(Map.Entry<Integer, List> e : hashMap.entrySet()) {
            if(e.getValue().size() > A.length/2){
                return (int)e.getValue().get(0);
            }
        }

        return -1;
    }
}
