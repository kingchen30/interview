import javax.sound.midi.SoundbankResource;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
      int[] arr1 = {1, 3};
      int[] arr2 = {2};

       System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = (m+n+1)/2;
        int r = (m+n+2)/2;
        return (getKth(nums1, 0, nums2, 0, l) + getKth(nums1, 0, nums2, 0, r))/2.0;
    }
    private static int getKth(int[] nums1, int start1, int[] nums2, int start2, int k){
        if(start1 > nums1.length-1) return nums2[start2+k-1];
        if(start2 > nums2.length-1) return nums1[start1+k-1];
        if(k == 1) return Math.min(nums1[start1], nums2[start2]);

        int num1Mid = start1+k/2-1 < nums1.length ? nums1[start1+k/2-1] : Integer.MAX_VALUE;
        int num2Mid = start2+k/2-1 < nums1.length ? nums2[start1+k/2-1] : Integer.MAX_VALUE;

        if(num1Mid < num2Mid)
            return getKth(nums1, start1+k/2, nums2, start2, k-k/2);
        else
            return getKth(nums1, start1, nums2, start2+k/2, k-k/2);
    }
}
