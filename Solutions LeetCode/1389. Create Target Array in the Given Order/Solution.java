class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> teste = new ArrayList<>();

        for (int i = 0;i<index.length; i++) {
            teste.add(index[i],nums[i]);
        }

        int[] target = new int[teste.size()];

        for (int i = 0; i < target.length; i++) {
            target[i] = teste.get(i);
        }

        return target;

    }
}