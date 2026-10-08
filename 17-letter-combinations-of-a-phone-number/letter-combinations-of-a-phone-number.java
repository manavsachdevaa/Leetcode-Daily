class Solution {
    String[] map={
         "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        StringBuilder sb=new StringBuilder();
        backtrack(digits,0,sb);
        return ans;
    }
    public void backtrack(String digits,int idx,StringBuilder sb){
        if(idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters=map[digits.charAt(idx)-'0'];
        for(char ch:letters.toCharArray()){
            sb.append(ch);
            backtrack(digits,idx+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}