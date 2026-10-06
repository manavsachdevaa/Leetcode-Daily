class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int extra_close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    extra_close++;
                }
            }
        }
        return open + extra_close;
    }
}