package leetcode.editor.cn;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8834 👎 0

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        System.out.println("solution = " + solution);
        int[] a = {2, 7, 11, 19};
        int[] twoSum = solution.twoSum(a, 9);
        Arrays.stream(twoSum).forEach(x -> System.out.println("twoSum = " + x));



    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            return new int[]{0, 1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


} 