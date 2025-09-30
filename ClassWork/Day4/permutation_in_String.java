package ICP.Home_Assignment4;
public class permutation_in_String {
    
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())  return false; 
        int[] f1=new int[26];
        int[] f2=new int[26];
        // maintaining first window
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
            f2[s2.charAt(i)-'a']++;
        }

        if(same(f1,f2)) return true;

        for(int i=s1.length();i<s2.length();i++){
            f2[s2.charAt(i)-'a']++;
            f2[s2.charAt(i-s1.length())-'a']--;
            if(same(f1,f2)) return true;
        }
        return false;
    }
    private boolean same(int[] frq1, int[] frq2) {
        for (int i = 0; i < 26; i++) {
            if (frq1[i] != frq2[i]) return false;
        }
        return true;
    }

}
