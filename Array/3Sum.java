class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1st Approach : Hashing

        // Set<List<Integer>> ansSet= new HashSet<>();
        // for(int i=0 ;i<nums.length ; i++)
        // {
        //     Set<Integer> hashSet= new HashSet<>();
        //     for(int j=i+1 ; j<nums.length ; j++)
        //     {
        //         int third= -(nums[i]+nums[j]);
        //         if(hashSet.contains(third)) 
        //         {
        //             List<Integer> tempList= Arrays.asList(nums[i] , nums[j], third);
        //             tempList.sort(null);
        //             ansSet.add(tempList);
        //         }
        //         hashSet.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> ansList =new ArrayList<>(ansSet);
        // return ansList;
        

        // 2nd Approach - Two- Pointer
       List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for `i`

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ansList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicates for `j` and `k`
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ansList;
    }
    
}
