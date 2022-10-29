import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int i = 0;
        int j = i;
        int max = 0;
        Set<Character> chars = new HashSet<>();
        while (j < len) {
            char c = s.charAt(j);
            if (chars.contains(c)) {
                if (max < j - i) {
                    max = j - i;
                }
                chars.clear();
                while ( c != s.charAt(i)) {
                    i++;
                }
                i++;
                j = i;
            } else {
                chars.add(c);
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.lengthOfLongestSubstring("a");
    }
}
