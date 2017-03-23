public class Solution {
    ArrayList<String> res;
    
    public List<String> readBinaryWatch(int num) {
        res = new ArrayList<>();
        recur(0,9,num);
        return res;
    }
    
    void addTimeToList(int time) {
        if ((time >> 6)<=11 && (time&63)<=59)
            res.add(String.valueOf(time >> 6) + ":" + ((time&63) < 10 ? "0"+(time&63) : (time&63)));
    }
    
    void recur(int time, int pos, int onesLeft) {
        
        if (onesLeft == 0) {
            addTimeToList(time);
        } else {
            if (pos == -1) return;
            recur(time,pos-1,onesLeft); // set 0 to the position
            
            time |= 1<<pos;
            recur(time,pos-1,onesLeft-1); // set 1 to the position
            time &= ~(1<<pos);
        }
    }
}