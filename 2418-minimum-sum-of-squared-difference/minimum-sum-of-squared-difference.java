class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] diff=new int[100000+1];
        int k=k1+k2;
        for(int i=0;i<nums1.length;i++){
            int curr_diff=Math.abs(nums1[i]-nums2[i]);
            diff[curr_diff]++;
        }
        for(int i=100000;i>0 && k>0; i--){
            if(diff[i]!=0){
                int minops=Math.min(k,diff[i]);
                diff[i]=diff[i]-minops;
                diff[i-1]=diff[i-1]+minops;
                k=k-minops;
            }
        }
        long ans=0;
        for(int i=0;i<diff.length;i++){
            if(diff[i]!=0){
                ans=ans+((long)i*(long)i)*diff[i];
            }
        }
        return ans;

    }
}