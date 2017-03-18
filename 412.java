public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>(n);
        for (int i = 1, fz = 1,bz = 1; i <= n; i++, fz++, bz++) {
            String s = null;
            if (fz==3) {
                if (bz==5) {res.add("FizzBuzz");fz=0; bz=0;}
                else {res.add("Fizz");fz=0;}
            } else if (bz==5) {
                res.add("Buzz");
                bz=0;
            } else {
                res.add(String.valueOf(i));
            }
            
        }
        return res;
    }
}