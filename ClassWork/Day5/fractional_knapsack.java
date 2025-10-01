package ICP.ClassWork.Day5;

import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsack {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n=wt.length;
        double[][] ratio=new double[n][2];
        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)wt[i];
        }
        
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int currCap=capacity;
        double resVal=0;
       for(int i=n-1;i>=0;i--){
           int idx=(int) ratio[i][0];
           if(wt[idx]<=currCap){
               resVal+=val[idx];
               currCap-=wt[idx];
           }else{
               //fractional part
               resVal+=(ratio[i][1]*currCap);
               currCap=0;
               break;
           }
       }
        return resVal;
    }

}
