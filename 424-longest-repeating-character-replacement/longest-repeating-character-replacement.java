class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxfreq=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(i)));
            while((i-left+1)-maxfreq>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}