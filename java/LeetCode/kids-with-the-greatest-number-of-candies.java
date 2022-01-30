class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List<Boolean> result = new ArrayList<Boolean>();
        
        for(int candy : candies){
            greatest = (greatest < candy) ? candy : greatest;
        }
        
        for(int candy : candies){
            if(greatest <= (candy + extraCandies)){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        
        return result;
    }
}