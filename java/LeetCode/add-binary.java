import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger bA = new BigInteger(a, 2);
        BigInteger bB = new BigInteger(b, 2);
        
        return bA.add(bB).toString(2);
    }
}