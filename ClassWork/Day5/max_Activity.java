package ICP.ClassWork.Day5;

import java.util.Arrays;
import java.util.Comparator;

public class max_Activity {
    
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int[][] act=new int[start.length][2];
        
        for(int i=0;i<start.length;i++){
        
            act[i][0]=start[i];
            act[i][1]=finish[i];
        }
        
        Arrays.sort(act,Comparator.comparingInt(o->o[1]));
        int maxAct=1;
        int end=act[0][1];
        for(int i=1;i<act.length;i++){
            if(end<act[i][0]){
                maxAct++;
                end=act[i][1];            }
        }
        return maxAct;
    }


}
