import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        
        for(int i : scoville){
            heap.offer(i);
        }
        
        while(heap.peek() < K){
            if(heap.size() < 2){
                return -1;
            }
            
            int food1 = heap.poll();
            int food2 = heap.poll();
            
            heap.offer(food1 + (food2 * 2));
            
            answer++;
        }
        
        return answer;
    }
}
