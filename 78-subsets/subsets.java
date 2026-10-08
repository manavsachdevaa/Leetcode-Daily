class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        backtrack(nums,0,curr);
        return ans;
    }
    public void backtrack(int[] nums,int idx,List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}