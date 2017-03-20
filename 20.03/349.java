public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                if (res.isEmpty() || res.get(res.size()-1) != nums1[i]) 
                    res.add(nums1[i]);
                i++; j++;
            }
        }
        int[] ret = new int[res.size()];
        for (i=0; i < ret.length; i++)
        {
            ret[i] = res.get(i);
        }
        return ret;
    }
}