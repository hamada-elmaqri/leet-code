import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
        /*Time Limit Exceeded */
        /*    
        //Input: nums = [1,2,3,1]
        int n = nums.length;
            for (int i =0 ; i<n-1; i++){
                for (int j = i+1 ; j<n; j++){
                     if (nums[i] == nums[j])
                        return true;
                }
            }
            return false;
         }*/

    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums1 = {1,2,3,1};//Input: nums = [1,2,3,1] Output: true
        int[] nums2 = {1,2,3,4};//Input: nums = [1,2,3,4] Output: false
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};//Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
        System.out.println(solution.containsDuplicate(nums1));
        System.out.println(solution.containsDuplicate(nums2));
        System.out.println(solution.containsDuplicate(nums3));
    }}

