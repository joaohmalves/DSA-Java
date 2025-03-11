public class SubSum {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;

        while (n>0){
            int dir = n%10;
            sum+=dir;
            pro*=dir;
            n/=10;

        }
        return pro-sum;
    }
}
