class Solution {
    public int minPartitions(String n) {
        int max = -1;
        
        for(int i=0; i<n.length(); i++){
            int number = n.charAt(i) - '0';
            max = (max > number) ? max : number;
        }
        
        return max;
    }
}