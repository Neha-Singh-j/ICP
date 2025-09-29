package ICP.ClassWork.Day1;

public class majority_Elements {
    public int majorityElement(int[] nums) {
    //    moorevoting algorithm..
    // it can work only when majority elemenrt exits compulsory hona hi hai 
    int ele=nums[0];
    int v=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==ele){
            v++;
        }else{
            v--;
            if(v==0){
                ele=nums[i];
                v=1;
            }
        }
    }
    return ele;
        
    }
}