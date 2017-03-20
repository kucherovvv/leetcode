public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        /*int[] numAvailible = new int[26];
        int[] numRequired = new int[26];
        for (int i = 0; i < magazine.length(); i++) numAvailible[magazine.charAt(i)-'a']++;
        for (int i = 0; i < ransomNote.length(); i++) numRequired[ransomNote.charAt(i)-'a']++;
        for (int i = 0; i < 26; i++) 
            if (numAvailible[i] < numRequired[i]) return false;
        return true;*/
        // лишний массив, можно и без него
        int[] numAvailible = new int[26];
        for (int i = 0; i < magazine.length(); i++) numAvailible[magazine.charAt(i)-'a']++;
        for (int i = 0; i < ransomNote.length(); i++) 
            if (--numAvailible[ransomNote.charAt(i)-'a'] < 0 ) return false;
        return true;
    }
}