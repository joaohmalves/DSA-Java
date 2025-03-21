public class EvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits % 2 ==0;
    }

    int digits(int num){
        if(num<0){
            num = num*-1;
        }
        return(int)(Math.log10(num))+1;
    }
}
