class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int i=0;

    for(int j=l;j<=r;j++){
        while(i<nums.size()){
            sum=sum+nums.get(i);
            if(i-left+1==j){
                if(sum>0){
                min=Math.min(min,sum);
                }
                sum=sum-nums.get(left);
                left++;
            }
            i++;
        }
        sum=0;
        left=0;
        i=0;
    }
       
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
        
    }
}