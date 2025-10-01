package ICP.ClassWork.Day5;

public class candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] c=new int[n];
        int candies=0;
        for(int i=0;i<n;i++){
            c[i]=1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                c[i]=c[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
             if(ratings[i]>ratings[i+1]){
                c[i]=Math.max(c[i],c[i+1]+1); // tabhi badhana hai jb hmari nbrs se km hai
            }
        }
        for(int i=0;i<n;i++){
            candies+=c[i];
        }

       return candies;
    }

}
