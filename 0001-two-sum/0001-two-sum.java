class Solution {
    public int[] twoSum(int[] nums, int target) {

        int LengthOfArray = nums.length;


        for(int i = 0;i<LengthOfArray;i++){
            for(int j = i+1;j<LengthOfArray;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};


    }
}