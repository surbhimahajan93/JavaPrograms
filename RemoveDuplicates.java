/* Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.  */

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 2){
            return nums.length;
        }
       int slowPointer = 0;
       for( int fastPointer = 0; fastPointer < nums.length; fastPointer++){
           if(nums[fastPointer] != nums[slowPointer]){
               slowPointer++;
               nums[slowPointer] = nums[fastPointer];
           }
       }
        return slowPointer+1;
    }
}