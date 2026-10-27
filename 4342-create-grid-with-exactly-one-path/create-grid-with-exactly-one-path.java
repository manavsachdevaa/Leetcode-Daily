class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(arr[i],'#');
        }
        for(int i=0;i<m;i++){
            arr[i][0]='.';
        }
        for(int j=1;j<n;j++){
            arr[m-1][j]='.';
        }
        String[] str=new String[m];
        for(int i=0;i<m;i++){
            str[i]=new String(arr[i]);
        }
        return str;
    }
}