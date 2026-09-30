import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 정렬된 상태에서 짝수 번째 인덱스는 항상 최소값이다.
            // 정렬 함수를 사용하지 않아도되지만 속도 차이는 거의없다
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
