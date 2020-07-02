class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int curr = 0;
        
        while (curr <= r) {
            if (nums[curr] == 0) {
                swap(nums, l, curr);
                l++;
                curr++;
            }
            else if (nums[curr] == 1) {
                curr++;
            }
            else {
                swap(nums, r, curr);
                r--;
            }
        }
    }
    
    public void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}