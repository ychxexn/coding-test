class Solution {
    public int solution(String s) {
        int answer = s.length();
        String comp = null;
        int compLen = 0;
        
        for(int i=1; i<=s.length()/2; i++){     // s길이/2 개씩까지만 압축 가능함
            comp = compression(s, i);  // i개씩 압축한 문자열
            compLen = comp.length();
            
            answer = (answer < compLen) ? answer : compLen; // 길이 최소값 계산
        }
        return answer;
    }
    
    // 문자열 s를 cnt개 단위로 비교해서 압축
    public String compression(String s, int cnt){
        String pattern = "";
        int repeatCnt = 1;
        String compression = "";
        
        for(int i=0; i<s.length()+cnt; i+=cnt){
            String now = null;
            
            if(i >= s.length()){
                now = "";
            }else if(i+cnt > s.length()){
                now = s.substring(i);
            }else{
                now = s.substring(i, i+cnt);
            }
            
            if(i != 0){
                if(pattern.equals(now)){
                    repeatCnt++;
                }else if(repeatCnt > 1){
                    compression += repeatCnt + pattern;
                    repeatCnt = 1;
                }else{
                    compression += pattern;
                }
            }
            
            pattern = now;
        }
        return compression;
    }
}
