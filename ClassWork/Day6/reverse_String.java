package ICP.ClassWork.Day6;

public class reverse_String {
    
    public void reverseString(char[] s) {
        rec(s,0,s.length-1);
    }
    public static void rec(char[] s, int i, int n){
        if(i>=n) return; //indices crosses
        char temp=s[i];
        s[i]=s[n];
        s[n]=temp;
        rec(s,i+1,n-1);
    }
}
