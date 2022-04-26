class Solution {
    public int minCostConnectPoints(int[][] points) {
        int[] edges = new int[100];
        int idx = 0;
        
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                int[] p1 = points[i];
                int[] p2 = points[j];
                edges[idx++] = getDistance(p1, p2);
            }
        }
        
        for(int edge : edges){
            System.out.println(edge);
        }
        
        return 0;
    }
    
    public int getDistance(int[] p1, int[] p2){
        int d1 = Math.abs(p1[0] - p2[0]);
        int d2 = Math.abs(p1[1] - p2[1]);
        
        return d1 + d2;
    }
    
    public int findParent(int[] parent, int a){
        if(parent[a] == a){
            return a;
        }
        parent[a] = findParent(parent, parent[a]);
        
        return parent[a];
    }
    
    public void unionParent(int[] parent, int a, int b){
        a = findParent(parent, a);
        b = findParent(parent, b);
        if(a < b){
            parent[b] = a;
        }else{
            parent[a] = b;
        }
    }
    
    
}
