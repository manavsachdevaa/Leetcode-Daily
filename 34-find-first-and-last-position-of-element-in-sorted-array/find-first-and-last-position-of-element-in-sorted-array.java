class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int first=-1;
        // int last=-1;
        
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         if(first==-1){
        //             first=i;
        //         }
        //         last=i;
        //     }
        // }
        // int [] result={first,last};
        // return result;


        int low=0;
        int high=nums.length-1;
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res[0]=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res[1]=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;


}
}