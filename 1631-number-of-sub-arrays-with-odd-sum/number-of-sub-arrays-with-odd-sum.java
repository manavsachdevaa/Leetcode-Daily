class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1_000_000_007;
        int ct=0;
        int sum=0;
        int odd=0;
        int even=1;
        for(int ele:arr){
            sum=sum+ele;
            if(sum%2==0){
                ct+=odd;
                even++;
            }
            else{
                ct+=even;
                odd++;
            }
            ct=ct%mod;
        }
        return ct;

    }
}