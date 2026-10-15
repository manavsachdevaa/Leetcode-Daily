class Solution {
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
    List<Integer> temp=new ArrayList<>();
    backtrack(nums,temp,0);
    return ans;

        
    }
    public void backtrack(int[]nums,List<Integer> temp,int idx){
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}