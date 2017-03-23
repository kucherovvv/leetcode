public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>(); 
        
        int i,j;
        for (i=j=0; i < n && j < m;) {
            if (nums1[i]==nums2[j]) {
                res.add(nums1[i]);
                i++; j++;
            } else if (nums1[i]<nums2[j]) i++; 
            else j++;
        }
        
        int[] resi = new int[res.size()];
        for (i = 0; i < res.size(); i++) resi[i] = res.get(i);
        return resi;
        
        /*
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           r[i] = result.get(i);
       }
    
       return r;*/
    }
}