package HomeWork5;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,2,1};
        int[] nums2 = new int[] {3,2,1,4,7};
//        int[] nums1 = new int[] {0,0,0,0,0};
//        int[] nums2 = new int[] {0,0,0,0,0};
        System.out.printf("Максимальная длина общей подстроки: %d", Scripts.findMaxSubArray(nums1, nums2));
    }
}
