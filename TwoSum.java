class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int taiTab = nums.length;
        for (int i = 0; i < taiTab; i++) {
            for (int j = i + 1; j < taiTab; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("["+result[0] +","+result[1]+"]");
    }
}