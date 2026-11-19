class Solution {
    public int minChanges(String s) {
        int ct=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ct++;
            }
            i++;
        }
        return ct;
    }
}


