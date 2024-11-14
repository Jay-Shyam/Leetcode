class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int sumer = target - nums[i];
            int sumer_index = linear_find(nums,sumer,i+1);
            if(sumer_index==-1){
                continue;
            }
        return new int[]{i,sumer_index};
        }
    return new int[0];
    }
    public int linear_find(int[] nums,int x,int start){
        for(int i=start; i< nums.length;i++){
            if(nums[i]==x){ 
                return i;
            }
            
        }
    return -1;
    }

}