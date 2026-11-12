class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc_ans=1;
        int dec_ans=1;
        int max_inc=inc_ans;
        int max_dec=dec_ans;
        int left=0;
        //inc
        int i=1;
        while(i<nums.length){
            if(nums[i]>nums[i-1]){
                dec_ans=1;
                inc_ans++;
                max_inc=Math.max(max_inc,inc_ans);

                
            }
            else if(nums[i]<nums[i-1]){
                inc_ans=1;
                dec_ans++;
                max_dec=Math.max(dec_ans,max_dec);
                
            }
            else{
                inc_ans=1;
                dec_ans=1;
            }
            i++;
            
        }
        return Math.max(max_inc,max_dec);

        //1 4 8 6 5 4 4 2
 
    }
}