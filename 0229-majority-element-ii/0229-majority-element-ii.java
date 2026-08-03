class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0;i<n;i++){


            if(count1 == 0 && nums[i]!= element2){

                count1 = 1;
                element1 = nums[i];

            }
            else if(count2 == 0 && nums[i]!= element1){
                count2 = 1;
                element2 = nums[i];
                
            }
            else if(element1 == nums[i]){
                count1++;

            }else if(element2 == nums[i]){
                count2++;


            }
            else{
                count1--;
                count2--;
            }

        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == element1)
                count1++;
            else if (num == element2)
                count2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > n / 3)
            ans.add(element1);

        if (count2 > n / 3)
            ans.add(element2);

        return ans;

        

        
    }
}


// List<Integer> list = new ArrayList<>();
//         int n = nums.length;


//         for(int i = 0;i<n;i++){

//             // if(list.size() == 0 ||list.get(list.size()-1) != nums[i]){
//               if (!list.contains(nums[i])) {
//                 int count = 0;
//                 for(int j = 0;j<n;j++){
//                     if(nums[j] == nums[i]){
                        
//                         count++;
//                     }

//                 }
//                 if(count > n/3){
//                     list.add(nums[i]);

//                 }
//             }

//         }

//         return list;
