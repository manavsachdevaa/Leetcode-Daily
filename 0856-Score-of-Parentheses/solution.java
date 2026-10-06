class Solution {
    public int scoreOfParentheses(String s) {
        // Stack<Integer> stk=new Stack<>();
        // int score=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         stk.push(score);
        //         score=0;
        //     }
        //     else{
        //         if(s.charAt(i-1)=='('){
        //             score=stk.pop() + 1;
        //         }
        //         else{
        //             score=stk.pop() + (2*score);
        //         }
        //     }
        // }
        // return score;

        //===============approach2================

        int depth=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }
            else{
                depth--;
                if(s.charAt(i-1)=='('){
                    score+=(int)Math.pow(2,depth);
                }
            }
        }
        return score;
    }
}



