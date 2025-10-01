package ICP.ClassWork.Day5;

import java.util.Arrays;

public class minimum_number_of_Arrows_to_burst_balloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));

        int a = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
               a++;
                end = points[i][1];
            }
        }
        return a;
    }
}
