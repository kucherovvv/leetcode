public class Solution {
    public String[] findWords(String[] words) {
        
        ArrayList<String> res = new ArrayList<>();
        String[] rows = {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        
        for (String s: words) {
            
            int prevRow = -1;
            int row = -1;
            boolean isAccepted = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (rows[0].indexOf(c)!=-1) row = 0;
                else if (rows[1].indexOf(c)!=-1) row = 1;
                else if (rows[2].indexOf(c)!=-1) row = 2;
                else row=-11111111;//????????
                
                if (prevRow!=-1 && row!=prevRow) {
                    isAccepted=false;
                    break;
                }
                prevRow = row;
            }
            
            if (isAccepted) res.add(s);
            
            
            
            
        }
        return res.toArray(new String[0]);
    }
}