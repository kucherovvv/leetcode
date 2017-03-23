public class Solution {
    //dumb brut is dumb
    /*public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        if (n < 3) return 0;
        int count = 0;
        
        
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    count += checkBoomerang(points[i], points[j], points[k]);
                }
            }
        }
        
        return count;
    }
    
    int dist2(int[] a, int[] b) { return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]); }
    
    int checkBoomerang(int[] a, int[] b, int[] c) {
        int ab = dist2(a,b), ac = dist2(a,c), bc = dist2(b,c);
        int res = 0;
        if (ab==ac) res+=2;
        if (ab==bc) res+=2;
        if (ac==bc) res+=2;
        return res;
    }*/
    
    
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
    
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<points.length; i++) {
            for(int j=0; j<points.length; j++) {
                if(i == j)
                    continue;
                
                int d = getDistance(points[i], points[j]);                
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            
            for(int val : map.values()) {
                res += val * (val-1);
            }            
            map.clear();
        }
        
        return res;
    }
    
    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        
        return dx*dx + dy*dy;
    }
}