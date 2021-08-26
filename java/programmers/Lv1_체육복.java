import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List lostList = new ArrayList(Arrays.stream(lost).boxed().collect(Collectors.toList()));
        List reserveList = new ArrayList(Arrays.stream(reserve).boxed().collect(Collectors.toList()));
        
        
        for(int i=1; i<=n; i++){
            if(lostList.contains(i)){
                if(reserveList.contains(i)){
                    // 내가 여분 체육복이 있음
                    reserveList.remove((Integer)i);
                    continue;
                }else if(reserveList.contains(i-1)){
                    // 내 앞 번호가 여분 체육복이 있음
                    reserveList.remove((Integer)(i-1));
                    continue;
                }else if(reserveList.contains(i+1)){
                    // 내 뒷 번호가 여분 체육복이 있음
                    if(lostList.contains(i+1)){
                        // 뒷 번호도 도난당했으면 못 빌림
                        lostList.remove((Integer)(i+1));
                        reserveList.remove((Integer)(i+1));
                    }else{
                        reserveList.remove((Integer)(i+1));
                        continue;
                    }
                }
                answer--;
            }
        }
        
        return answer;
    }
}
