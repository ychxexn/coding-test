class Solution {
    boolean solution(String s) {
        boolean answer = true;

        answer = s.toLowerCase().replaceAll("p", "").length() == s.toLowerCase().replaceAll("y", "").length();

        return answer;
    }
}
