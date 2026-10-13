class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int min=1;
        int ans=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(isvalid(piles,mid)<=h){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public long isvalid(int[] piles,int mid){
        long res=0;
        for(int i=0;i<piles.length;i++){
            res+=(piles[i]+mid-1L)/mid;
        }
        return res;
    }
}