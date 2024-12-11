class Solution {
    public int removeDuplicates(int[] nums) {
        

        if(nums.length==0) return 0;

        int unique_array_length= 1;
        for(int i = 1; i< nums.length; i++){
            //nums[i-1] = current
            //next = nums[i];
            if(nums[i-1] ==nums[i]){
                continue;
            }
            else{
                
                nums[unique_array_length] = nums[i];
                unique_array_length++ ;
            }

        }
        return unique_array_length;
    }
}