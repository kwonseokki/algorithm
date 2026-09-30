import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int result = Main.arrayPairSum(new int[]{1,4,3,2});
        System.out.println("RESULT: " + result);
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }
}
