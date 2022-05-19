class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            if(map.get(c) < map.get(s.charAt(i+1))){
                answer -= map.get(c);
            }else{
                answer += map.get(c);
            }
        }
        answer += map.get(s.charAt(s.length()-1));
        
        return answer;
    }
}
