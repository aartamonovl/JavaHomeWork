package HomeWork5;

public class Scripts {
    public static int findMaxSubArray (int[] nums1, int[] nums2){
        long startTime = System.nanoTime();
        int maxLen = 0;
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int k : nums2) {
                if (i + count < n &&
                        nums1[i + count] == k) {
                    count++;
                } else if (count != 0) {
                    i = i + count - 1;
                    break;
                }
            }
            if (count > maxLen){
                maxLen = count;
            }
        }
        System.out.printf("Скорость выполнения метода: %d нс", System.nanoTime() - startTime);
        System.out.println();
        return maxLen;
    }
}
