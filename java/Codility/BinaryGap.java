class Solution {
    public int solution(int N) {
        int answer = 0;
        String convert = Integer.toString(N, 2);

        try{
            convert = convert.substring(convert.indexOf("1") + 1, convert.lastIndexOf("1"));
            for(String s : convert.split("1")){
                answer = (s.length() > answer) ? s.length() : answer;
            }
        }catch(StringIndexOutOfBoundsException e){
            return 0;
        }

        return answer;
    }
}
