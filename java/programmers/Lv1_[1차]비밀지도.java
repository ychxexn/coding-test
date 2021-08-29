import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        Arrays.fill(answer, "");
        
        for(int i=0; i<arr1.length; i++){
            String str1 = getRow(arr1[i], n);
            String str2 = getRow(arr2[i], n);
            
            for(int j=0; j<str1.length(); j++){
                answer[i] += (str1.charAt(j) == '1' || str2.charAt(j) == '1') ? "#" : " ";
            }
        }
        
        return answer;
    }
    
    public String getRow(int num, int len){
        String str = "";
        
        while(num != 0){
            str = (num % 2) + str;
            num /= 2;
        }
        
        while(str.length() < len){
            str = "0" + str;
        }
        
        return str;
    }
}
