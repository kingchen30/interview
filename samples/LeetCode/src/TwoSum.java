import java.util.Arrays;
import java.util.HashMap;

/**
 * * Given an array of integers, return indices of the two numbers such that they add up to a
 * specific target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>Example:
 *
 * <p>Given nums = [2, 7, 11, 15], target = 9,
 *
 * <p>Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    System.out.print(Arrays.toString(twoSum(nums,target)));
  }
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        HashMap<Integer,Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if(hashMap.containsKey(target-nums[i])){
          indexs[0] = hashMap.get(target-nums[i]);
          indexs[1] = i;
          return indexs;
      }
      hashMap.put(nums[i],i);
    }
    return indexs;
    }
}
