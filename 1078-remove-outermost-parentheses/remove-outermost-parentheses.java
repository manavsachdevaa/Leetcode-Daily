class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                d--;
            }
            if(d>0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                d++;
            }
        }
        return sb.toString();
    }
}