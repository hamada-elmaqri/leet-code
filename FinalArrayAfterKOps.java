import java.util.Arrays;

public class FinalArrayAfterKOps {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        //nums = {2, 1, 3, 5, 6};
        //k = 5 operations
        for (int operation = 0; operation < k; operation++) {
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                //nums length = 5
                if (nums[i] < nums[minIndex]) {
                    // nums[1]=1<nums[0]=2
                    // nums[2]=3<nums[1]=1#
                    // nums[3]=5<nums[2]=3#
                    // nums[4]=6<nums[3]=5#
                    //nums = {2, 2, 3, 5, 6};
                    // nums[1]=2<nums[0]=2#
                    // nums[2]=3<nums[1]=2#
                    // nums[3]=5<nums[2]=3#
                    // nums[4]=6<nums[3]=5#
                    minIndex = i;
                    // minIndex = 1
                    // minIndex = 2
                }
            }
            nums[minIndex] *= multiplier;
            System.out.printf(Arrays.toString(nums)+"\n");
        }
        return nums;
    }

    public static void main(String[] args) {
        FinalArrayAfterKOps finalArrayAfterKOps = new FinalArrayAfterKOps();
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;

        int[] result = finalArrayAfterKOps.getFinalState(nums, k, multiplier);

        System.out.println("Final array: " + Arrays.toString(result));
    }
}
