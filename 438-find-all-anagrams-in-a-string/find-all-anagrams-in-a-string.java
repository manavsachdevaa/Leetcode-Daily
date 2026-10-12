class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> temp=new HashMap<>();
        int left=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            temp.put(s.charAt(i),temp.getOrDefault(s.charAt(i),0)+1);
            if(i-left+1>p.length()){
                int val=temp.get(s.charAt(left));
                if(val==1){
                    temp.remove(s.charAt(left));
                }
                else{
                temp.put(s.charAt(left),temp.get(s.charAt(left))-1);
                
            }
            left++;
            }

            if(i-left+1==p.length()){
                if(map.equals(temp)){
                    list.add(left);
                }
            }
        }
        return list;
    }
}