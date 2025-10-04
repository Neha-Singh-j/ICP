package ICP.ClassWork.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinaton_Sum_2 {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        rec(candidates,target,0,ans,curr);
        return ans;
    }
    public static void rec(int[] arr, int target, int idx,List<List<Integer>> ans, List<Integer> curr){

        // base case
        if(target==0){
            ans.add(new ArrayList<>(curr)); 
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(arr[i]<=target){
                if(i>idx && arr[i]==arr[i-1]) continue;
                curr.add(arr[i]);
                rec(arr,target-arr[i],i+1,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    }

}
