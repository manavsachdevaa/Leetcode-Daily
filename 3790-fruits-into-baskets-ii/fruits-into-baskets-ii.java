class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=-1;
                    break;
                }
            }
        }
        int ct=0;
        for(int e:baskets){
            if(e!=-1){
                ct++;
            }
        }
        return ct;
    }
}