public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length()==0) return true;
        
        boolean isAccepted = true;
        boolean prevUpper = Character.isUpperCase(word.charAt(0)), curUpper, multiUpper = false;
        for (int i = 1; i < word.length(); i++) {
            curUpper = Character.isUpperCase(word.charAt(i));
            
            
            if (prevUpper && curUpper) multiUpper = true;
            if (!prevUpper && curUpper) {
                isAccepted = false;
                break;
            }
            if (prevUpper && !curUpper && multiUpper) {
                isAccepted = false;
                break;
            }
            
            prevUpper = curUpper;
        }
        
        
        return isAccepted;
    }
}