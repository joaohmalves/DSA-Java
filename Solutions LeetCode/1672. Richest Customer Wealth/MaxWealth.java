public class MaxWealth {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++){
            int x=0;
            for(int j=0;j<accounts[i].length;j++){
                x+=accounts[i][j];
            }
            if(x>maxwealth){
                maxwealth=x;
            }

        }
        return maxwealth;
    }
}
