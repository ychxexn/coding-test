import java.util.regex.Pattern;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        if(new_id == null || new_id.length() == 0){
            new_id = "a";
        }
        
        if(isValidId(new_id)){
            answer = new_id;
        }else{
            answer = makeNewId(new_id);
        }
        
        return answer;
    }
    
    public boolean isValidId(String id){
        boolean isValid = true;
        
        // 3자 이상 15자 이하
        if(!(id.length() >= 3 && id.length() <= 15)){
            isValid = false;
        }
        
        // 알파벳 소문자, 숫자, 특수문자(- _ .)
        Pattern regPattern1 = Pattern.compile("^[a-z0-9-_.]$");
        if(!regPattern1.matcher(id).find()){
            isValid = false;
        }
        
        // 마침표
        Pattern regPattern2 = Pattern.compile("^\\.|.$");
        Pattern regPattern3 = Pattern.compile("(.)\\1");
        if(regPattern2.matcher(id).find() || regPattern3.matcher(id).find()){
            isValid = false;
        }
        
        return isValid;
    }
    
    public String makeNewId(String id){
        String newId = id;
        
        // 소문자 치환
        newId = newId.toLowerCase();
        
        // 유효하지 않은 문자 제거
        newId = newId.replaceAll("[^a-z0-9-_\\.]", "");
        
        // 마침표 연속 제거
        newId = newId.replaceAll("\\.+", ".");
        
        // 처음과 끝의 마침표 제거
        newId = newId.replaceAll("^\\.+|\\.+$", "");
        
        // 빈 문자열 체크
        if(newId == null || newId.length() == 0){
            newId = "a";
        }
        
        // 16자 이상 체크
        if(newId.length() >= 16){
            newId = newId.substring(0, 15).replaceAll("\\.$", "");   
        }
        
        // 2자 이하 체크
        while(newId.length() < 3){
            newId += newId.charAt(newId.length()-1);
        }
        
        return newId;
    }
}
