class Solution {
    public int sortPermutation(int[] nums) {
        int k=-1; // -1 stores all set bits in java
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                k=k&nums[i];
            }
        }
        if(k==-1){
            return 0;
        }
        return k;
        
    }
}