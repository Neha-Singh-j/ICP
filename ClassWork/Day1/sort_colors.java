package ICP.ClassWork.Day1;

public class sort_colors {
    public void sortColors(int[] nums){
        int n=nums.length;
       int low=0,mid=0,hi=n-1;
       while(mid<=hi){
        if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
        }else if(nums[mid]==1){
            mid++;
        }else{
            int temp=nums[mid];
            nums[mid]=nums[hi];
            nums[hi]=temp;
            hi--;
        }
       }

    }
}