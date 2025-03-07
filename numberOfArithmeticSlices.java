// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length==0) return 0;
        int sum = 0;
        int prev=0;
        
        for(int i=nums.length-3;i>=0;i--) {
            
            if(nums[i+2]-nums[i+1]==nums[i+1]-nums[i]) {
                
                prev++;
                sum+=prev;
            } else {
                prev=0;
            }
        }
        
        return sum;
    }
}
