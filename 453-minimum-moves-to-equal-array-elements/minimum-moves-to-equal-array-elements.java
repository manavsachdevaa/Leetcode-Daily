class Solution {
    public int minMoves(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int e:nums){
        //     min=Math.min(min,e);
        // }
        Arrays.sort(nums);
        int ans=0;
        for(int e:nums){
            ans=ans+(e-nums[0]);
        }
        return ans;
    }
}