class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Approach 1 : Hashing (TC:O(n^3))
        // int n= nums.length;
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0 ; i<n ;i++)
        // {
        //     for(int j=i+1 ; j<n ;j++)
        //     {
        //         Set<Long> hashSet= new HashSet<>();
        //         for(int k= j+1 ; k<n ;k++)
        //         {
        //             long sum=nums[i]+nums[j];
        //             sum+=nums[k];
        //             long fourth=target-sum;
        //             if(hashSet.contains(fourth))
        //             {
        //                 List<Integer> smallList= Arrays.asList(nums[i],nums[j],nums[k] ,(int)fourth);
        //                 smallList.sort(null);
        //                 st.add(smallList);
        //             }
        //             hashSet.add((long)nums[k]);
        //         }
        //     }
        // }
        // List<List<Integer>> finalList=new ArrayList<>(st);
        // return finalList;

        //Approach 2: 
        int n= nums.length;
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0 ;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1 ; j< n ;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int k= j+1;
                int l=n-1;
                while(k<l)
                {
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target)
                    {
                        List<Integer> smallList= Arrays.asList(nums[i] , nums[j] , nums[k] , nums[l]);
                        ansList.add(smallList);
                        k++;
                        l--;

                        while(k<l && nums[k]== nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if(sum>target)
                    {
                        l--;
                    }
                    else
                    {
                        k++;
                    }
                }
            }
        }
        return ansList;
        
    }
}
