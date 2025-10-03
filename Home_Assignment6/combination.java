import java.util.ArrayList;
import java.util.List;

public class combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(n,k,1,result,new ArrayList());
        return result;
    }
    private void helper(int n, int k, int start, List<List<Integer>> result, List<Integer> temp) {
        if(temp.size()==k) {
            result.add(new ArrayList(temp));
            return;
        }
        for(int i=start;i<=n;i++) {
            temp.add(i);
            helper(n,k,i+1,result,temp);
            temp.remove(temp.size()-1);
        }
    }

}
