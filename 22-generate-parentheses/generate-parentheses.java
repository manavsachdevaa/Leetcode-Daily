class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        backtrack(list,"",n,0,0);
        return list;
    }
    public void backtrack(List<String> list,String curr,int n,int open,int close){
        if(open==n && close==n){
            list.add(curr);
            return;
        }

        if(open<n){
            backtrack(list,curr+"(",n,open+1,close);
        }
        if(close<open){
            backtrack(list,curr+")",n,open,close+1);
        }

    }
}