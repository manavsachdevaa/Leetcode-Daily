class Solution {
    public int triangleNumber(int[] nums) {
        int ct=0;
        Arrays.sort(nums);
        for(int k=nums.length-1;k>=2;k--){
            int low=0;
            int high=k-1;
            while(low<high){
                if(nums[low]+nums[high]>nums[k]){
                    ct+=high-low;
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return ct;
    }
}