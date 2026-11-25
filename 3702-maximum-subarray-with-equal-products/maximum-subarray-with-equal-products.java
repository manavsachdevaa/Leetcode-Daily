class Solution {
    public int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }
    public int findLcm(int a,int b){
        return (a*b)/findGcd(a,b);
    }
    public int maxLength(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            int gcd=0;
            int lcm=1;

            for(int j=i;j<nums.length;j++){
                pro=pro*nums[j];
                gcd=findGcd(gcd,nums[j]);
                lcm=findLcm(lcm,nums[j]);
                if(pro==gcd*lcm){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}