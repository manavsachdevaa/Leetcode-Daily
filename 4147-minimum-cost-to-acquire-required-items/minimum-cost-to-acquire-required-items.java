class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
       long total=0;
       if(cost1+cost2<=costBoth){
            total=(long)cost1*(long)need1 + (long)cost2*(long)need2;
            return total;
       }
       else{
            long min_need=Math.min((long)need1,(long)need2);
            total=total + (long)costBoth*min_need;
            need1=need1-(int)min_need;
            need2=need2-(int)min_need;
            if(need1>0){
                long min1=Math.min((long)cost1,(long)costBoth);
                total+=min1*(long)need1;
            }
            else if(need2>0){
                long min2=Math.min((long)cost2,(long)costBoth);
                total+=min2*(long)need2;
            }
       }
       return total;
    }
}