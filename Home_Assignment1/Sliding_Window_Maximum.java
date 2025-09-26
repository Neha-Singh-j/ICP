// leetcode :239

import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];  
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //this is first window
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        result[0] = pq.peek();
        for (int i = 1; i <= n - k; i++) {
            pq.remove(nums[i - 1]);  // O(k) as k elemnts in our curr pq
            pq.add(nums[i + k - 1]);  // O(log k) adding in sorted order just like binary search
            result[i] = pq.peek(); //max of currrent window
        }

        return result;
    }
}
