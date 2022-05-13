class MinStack {

    private List<Integer> list;
    private int min = Integer.MAX_VALUE;
    
    public MinStack() {
        list = new ArrayList();
    }
    
    public void push(int val) {
        list.add(val);
        min = Math.min(min, val);
    }
    
    public void pop() {
        list.remove(list.size()-1);
        
        min = Integer.MAX_VALUE;
        for(int num : list){
            min = Math.min(min, num);
        }
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
