package leetcode;

import java.util.Scanner;

/**
 * @Author Eric Zhang
 * @Date 2017/3/24 21:22
 */
public class _88MergeSortedArray {
    public static void main(String[] args) {
        _88MergeSortedArray obj = new _88MergeSortedArray();
        int[] A = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] B = {1, 2, 3};
        int n = 3;

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointM = m - 1;
        int pointN = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (pointM >= 0 && pointN >= 0) {
                if (nums1[pointM] > nums2[pointN])
                    nums1[i] = nums1[pointM--];
                else nums1[i] = nums2[pointN--];
            } else if (pointM >= 0) {
                nums1[i] = nums1[pointM--];
                ;
            } else if (pointN >= 0)
                nums1[i] = nums2[pointN--];
        }
    }
}
