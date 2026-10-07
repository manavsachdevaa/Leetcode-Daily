class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]);
        // }

        int first=0;
        int last=nums.length-1;
        int i=0;
        while(i<=last){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
                i++;
                first++;
            }
            else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[last];
                nums[last]=temp;
                last--;
            }
            else{
                i++;
            }
        }
        // return nums;
    }
}