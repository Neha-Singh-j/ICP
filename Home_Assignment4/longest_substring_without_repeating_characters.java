package ICP.Home_Assignment4;
import java.util.*;

public class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
        int res=0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch=s.charAt(end);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }                      
            set.add(ch);
            
            res = Math.max(end-start+1, res);
        }
        return res;
        }
    }

