class OrderedStream {

    private String[] order;
    private int count;
    
    public OrderedStream(int n) {
        order = new String[n];
        count = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList();
        
        order[idKey - 1] = value;
        
        for(int i=count; i<order.length; i++){
            if(order[i] == null){
                count = i;
                break;
            }
            result.add(order[i]);
        }
        
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
