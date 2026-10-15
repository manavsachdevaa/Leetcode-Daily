class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        backtrack(nums,temp);
        return ans;
    }
    public void backtrack(int[]nums,List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])){
                continue;
            }
            curr.add(nums[i]);
            backtrack(nums,curr);
            curr.remove(curr.size()-1);
        }
    }
}