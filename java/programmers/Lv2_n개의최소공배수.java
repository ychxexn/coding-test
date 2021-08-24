class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
		
		for(int i=0; ; i++) {
			cnt = 0;
			
			for(int j=0; j<arr.length; j++) {
				if(i < arr[j]) {
					break;
				}
				if(i % arr[j] == 0) {
					cnt++;
				}
			}
			
			if(cnt == arr.length) {
				return i;
			}
		}
    }
}
