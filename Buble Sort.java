public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2, 6, 1};

        

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
        
