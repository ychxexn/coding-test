class MyHashSet {

    private List<Integer> myHashSet;
    
    public MyHashSet() {
        myHashSet = new ArrayList();
    }
    
    public void add(int key) {
        if(!contains(key)){
            myHashSet.add(key);
        }
    }
    
    public void remove(int key) {
        int index = myHashSet.indexOf(key);
        if(index != -1){
            myHashSet.remove(index);
        }
    }
    
    public boolean contains(int key) {
        return myHashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
