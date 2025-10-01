public class longest_repeating_character_with_Replacement {
     public int characterReplacement(String s, int k) {
       
        int st=0;
        int max= Integer.MIN_VALUE;
        int len=0;
        int[] fr=new int[26];
        for(int end=0;end<s.length();end++){
            int idx = s.charAt(end) - 'A';
            fr[idx]++;
            max=Math.max(fr[idx],max);
            while((end-st+1)-max>k){
                fr[s.charAt(st)-'A']--;
                st++;
            }
            len=Math.max(len,(end-st+1));
        }
        return len;
    }
}
