class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] sq=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            sq[i]=(long)nums[i]*(long)nums[i];;
        }
        Arrays.sort(sq);
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                ans=ans-sq[i];
            }
            else{
                ans=ans+sq[i];
            }
        }
        return ans;
    }
}