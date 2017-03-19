public class Solution {

    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        int[] ind = new int[n];
        for (int i = 0; i < n; i++) ind[i] = i;
        String[] res = new String[n];
        
        qsort(nums,ind,0,n-1);
        
        for (int i = 0; i < n; i++) {
            if (i==n-1) res[ind[i]] = "Gold Medal";
            else if (i==n-2) res[ind[i]] = "Silver Medal";
            else if (i==n-3) res[ind[i]] = "Bronze Medal";
            else res[ind[i]] = String.valueOf(n-i);
        }
        
        return res;
    }
    
    private void qsort(int[] ar, int[] ind, int l, int r) {
        if (l>=r) return;
        int i = l,j = r;
        int x = ar[(l+r)/2];
        
        while (i <= j) {
            while (ar[i] < x) i++;
            while (ar[j] > x) j--;
            if (i <= j) {
                int t = ar[i]; ar[i] = ar[j]; ar[j] = t;
                t = ind[i]; ind[i] = ind[j]; ind[j] = t;
                i++; j--;
            }
        }
        if (l < j) qsort(ar,ind,l,j);
        if (i < r) qsort(ar,ind,i,r);
    }
}