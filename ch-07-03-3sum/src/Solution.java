import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> result = Solution.threeSum(new int[]{-1,0,1,2,-1,-4});
        for(List<Integer> nums: result) {
            System.out.println(nums);
        }
    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> result = new HashSet<>();
//
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            int left = i + 1;
//            int right = nums.length - 1;
//
//            while (left < right) {
//                int sum = nums[i] + nums[left] + nums[right];
//
//                if (nums[i] + nums[left] + nums[right] == 0) {
//                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
//                }
//                if (sum < 0) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//        }
//
//        return result.stream().toList();
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    // 세 정수의 합이 0이라면 left와 그 다음값이 다를때까지 left를 증가시킨다.
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                }
            }
        }

        return result;
    }
}
