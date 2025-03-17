class Solution {
    public int romanToInt(String s) {
        int r = 0;

        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int cur = roman.get(s.charAt(0)); // armazeno o primeiro elemento

        for (int i = 1; i < s.length(); i++) {
            int next =  roman.get(s.charAt(i)); // pego o elemento apartir do 1 (como se fosse o proximo do outro)
            if(cur<next) { // caso o atual for menor ele diminui na soma
                r -= cur;
            }
            else { // se nao soma normal
                r += cur;
            }

            cur = next; // aqui o elemento que era proximo vira atual para continuar o loop
        }
        r+=cur; // aqui ele no final soma o elemento atual com a soma

        return r;
    }
}