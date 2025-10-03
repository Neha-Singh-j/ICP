package ICP.Home_Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_Sum_2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        Permutation(candidates, target, curr, arr, 0);
        return arr;
    }

    public static void Permutation(int[] coin, int amount, List<Integer> curr, List<List<Integer>> arr, int indx) {
        if (amount == 0) {
            arr.add(new ArrayList<>(curr));
            return;
        }
        for (int i = indx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                  if( i>indx &&coin[i]==coin[i-1]) continue;
                    curr.add(coin[i]);
                    Permutation(coin, amount - coin[i], curr, arr, i+1 );
                    curr.remove(curr.size() - 1);
                  
                }

            }
        }
    
}
