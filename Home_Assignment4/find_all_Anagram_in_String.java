package ICP.Home_Assignment4;

import java.util.ArrayList;
import java.util.List;

public class find_all_Anagram_in_String {
    public List<Integer> findAnagrams(String s2, String s1) {
      List<Integer> ans = new ArrayList<>();
        if (s2.length() < s1.length()) return ans;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        // initialize first window
        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }

        if (isAnagram(f1, f2)) ans.add(0);
        // maintaing a sliding window of size p.length (s1 in this code)

        for (int i = s1.length(); i < s2.length(); i++) {
            f2[s2.charAt(i) - 'a']++;                   // add new char 
            f2[s2.charAt(i - s1.length()) - 'a']--;     // remove old char

            if (isAnagram(f1, f2)) ans.add(i - s1.length() + 1); 
        }

        return ans;
    }
    private boolean isAnagram(int[] pFreq, int[] sFreq) {
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] != sFreq[i]) return false;
        }
        return true;
    }

}
