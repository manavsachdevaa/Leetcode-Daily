class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int e:nums){
            max=Math.max(max,e);
        }
        int ans=0;
        for(int e:nums){
            ans=ans+(max-e);
        }
        return ans;
    }
}