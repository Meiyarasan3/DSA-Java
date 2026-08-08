Approach: Linear Search

Time Complexity: O(n)
Space Complexity: O(1)

Limitation:
The problem can be optimized to O(log n)
because the array is sorted and follows a pairing pattern.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n == 1 ){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(i == 0){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            else if(i == n-1){
                if(nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
            else{
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
