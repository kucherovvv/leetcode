public class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int l,w;
        //от sqrt ВНИЗ, а не вверх дурачок, блин
        for (w = (int)Math.sqrt(area); w >= 1; w--) {
            if (area%w==0) {
                res[0] = area/w;
                res[1] = w;
                break;
            }
        }
        
        return res;
    }
}