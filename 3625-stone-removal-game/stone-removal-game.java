class Solution {
    public boolean canAliceWin(int n) {
        int moves=10;
        int turn=0;
        while(n>=moves){
            n=n-moves;
            moves--;
            turn++;
        }
        if(turn%2==0){
            return false;
        }
        return true;
    }
}