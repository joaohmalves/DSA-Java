import java.util.ArrayList;
import java.util.HashSet;

//Minha solucao
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    result.add(nums2[j]);
                }
            }

        }

        int[] a = new int[result.size()];
        int i = 0;
        for (int num : result) {
            a[i++] = num;
        }

        return a;
    }
}

/* Solucao 0ms
*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int cur = nums1[0];

        HashSet<Integer> result = new HashSet<>();



        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    result.add(nums2[j]);
                }
            }


        }

        int[] a = new int[result.size()];
        int i = 0;
        for (int num : result) {
            a[i++] = num;
        }


        return a;
    }
}
*
* */