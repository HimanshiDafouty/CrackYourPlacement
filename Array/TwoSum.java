class Solution {
    public int[] twoSum(int[] nums, int target) {
         //Sort (Array Sort)
        // Arrays.sort(nums);
        // int i=0;
        // int j=nums.length-1;
        // while(i<j)
        // {
        //     if(nums[i]+nums[j]==target)
        //     {
        //         return new int[]{i,j};
        //     }
        //     if(nums[i]+nums[j]<target)
        //     {
        //         i++;
        //     }
        //     j--;
        // }
        // return new int[]{-1,-1};

        HashMap<Integer,Integer> map = new HashMap<>();
        int pair[]=new int[2];
        for(int i=0 ;i<nums.length ;i++)
        {
            int res=target-nums[i];
            if(map.get(res)!=null)
            {
                pair[0]=i;
                pair[1]=map.get(res);


            }
            else
            {
                map.put(nums[i],i);
            }

        }
        return pair;
       // int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         sum = nums[i] + nums[j];
        //         if (sum == target) {
        //             return new int[]{i ,j};
        //         }
        //     }
        // }

        // return new int[]{-1 ,-1};
    }
}
