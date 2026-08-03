class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int n = nums.length;


        for(int i = 0;i<n;i++){

            // if(list.size() == 0 ||list.get(list.size()-1) != nums[i]){
              if (!list.contains(nums[i])) {
                int count = 0;
                for(int j = 0;j<n;j++){
                    if(nums[j] == nums[i]){
                        
                        count++;
                    }

                }
                if(count > n/3){
                    list.add(nums[i]);

                }
            }

        }

        return list;


        
    }
}