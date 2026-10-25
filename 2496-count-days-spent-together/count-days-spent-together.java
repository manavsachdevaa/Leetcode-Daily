class Solution {
    int [] days={
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public int countdays(String day){
        int month=Integer.parseInt(day.substring(0,2));
        int date=Integer.parseInt(day.substring(3,5));
        int total_days=date;
        for(int i=0;i<month-1;i++){
            total_days+=days[i];
        }
        return total_days;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int alice_arrive=countdays(arriveAlice);
        int alice_leave=countdays(leaveAlice);
        int bob_arrive=countdays(arriveBob);
        int bob_leave=countdays(leaveBob);
        int start=Math.max(alice_arrive,bob_arrive);
        int end=Math.min(alice_leave,bob_leave);
        if(start>end){
            return 0;
        }
        return end-start+1;
    }
}