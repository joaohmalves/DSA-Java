class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) { //vai percorrer o array da direita pra esquerda
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
                //se o ultimo elemento for menos q 9 é so somar mais 1 e retornar imediato
            }
            digits[i] = 0;
            // se ele for 9 ele vai colocar 0 no lugar e dps vai voltar no loop
        //checando se tem outros 0 e caso o numero anterior nao for zero vai adicionar e retornar imediato
        }

        digits = new int[digits.length + 1]; //aqui em casos q o arr so tenha 9 ele adiciona uma casa
        digits[0] = 1; // e aqui deixa o primeiro elemento 1 (adicionando uma dezena ou centena sla)
        return digits;
}
