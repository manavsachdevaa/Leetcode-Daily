class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int diff=target-curr;
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(curr,i);
        }
        return new int[]{-1,-1};
    }
}