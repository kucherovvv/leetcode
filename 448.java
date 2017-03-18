public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length;) { // пока нет зацикливания и число не на месте, стоим на одной ячейке
            if ((i+1) == nums[i]) {
                i++;
                continue; // на месте!
            }
            
            int num = nums[i];
            if (nums[num-1] == num) { // возможность зациклиться
                i++;
                continue;
            }
            
            //знаем, что nums[num-1] != num; меняем местами
            int t = nums[i];
            nums[i] = nums[num-1];
            nums[num-1] = t;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if ((i+1) != nums[i]) res.add(i+1);
        }
        
        
        return res;*/
        // 
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
        return res;
    }
}