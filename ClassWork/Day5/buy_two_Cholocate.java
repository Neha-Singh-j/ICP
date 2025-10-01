package ICP.ClassWork.Day5;

public class buy_two_Cholocate {
    public int buyChoco(int[] prices, int money) {
       int p1=Integer.MAX_VALUE;
       int p2=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
        if(prices[i]<p1){
            p2=p1;
            p1=prices[i];
        }else{
            if(prices[i]<p2){
                p2=prices[i];
            }
        }
       }
       if(money<(p1+p2)) return money;
        else return money-(p1+p2);
    }
}
