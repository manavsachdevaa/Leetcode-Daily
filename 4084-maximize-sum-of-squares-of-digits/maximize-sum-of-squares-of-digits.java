class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int nines=sum/9;
        int remain=sum%9;
        StringBuilder sb=new StringBuilder();
        int temp=nines;
        while(temp>0){
            sb.append(9);
            temp--;
        }
        if(remain>0){
            sb.append(remain);
        }
        while(sb.length()<num){
            sb.append(0);
        }
        if(nines>num || sum>9*num){
            return "";
        }
        return sb.toString();
    }
}