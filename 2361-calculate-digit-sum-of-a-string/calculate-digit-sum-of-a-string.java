class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            int i=0;
            int j=0;
            int grps=0;
            StringBuilder sb=new StringBuilder();
            // int sum=0;
            if(s.length()%k==0){
                grps=s.length()/k;
            }
            else{
                grps=s.length()/k +1;
            }
            while(grps>0){
                int sum=0;
                for(j=i;j<i+k;j++){
                    if(j==s.length()){
                        break;
                    }
                    sum=sum+(s.charAt(j)-'0');
                    
                }
                sb.append(sum);
                i=j;
                grps--;
            }
            s=sb.toString();

        }
        return s;
    }
}