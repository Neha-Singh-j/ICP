package ICP.ClassWork.Day3;
import java.util.*;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++){
            int j=0;
            int k=image[0].length-1;
           while(j<=k){
               int temp = image[i][j] ^ 1;
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = temp;
                j++;
                k--;
            }
        }
        return image;
    }
}