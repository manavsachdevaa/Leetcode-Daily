class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[]  diff=new int[100000 +1];
        for(int i=0;i<nums1.length;i++){
            int currdiff=Math.abs(nums1[i]-nums2[i]);
            diff[currdiff]++;
        }
        int k=k1+k2;
        for(int i=diff.length-1;i>0 && k>0;i--){
            if(diff[i]!=0){
                int ct=diff[i];
                int minops=Math.min(k,ct);
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