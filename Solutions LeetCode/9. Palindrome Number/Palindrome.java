public class Palindrome {
        public boolean isPalindrome(int x) {
            String abc = Integer.toString(x);
            String novo = "";

            for(int i=abc.length()-1;i>=0;i--){

                novo += abc.charAt(i);
            }
            if (novo.equals(abc)){
                return true;
            }

            return false;
        }
}
