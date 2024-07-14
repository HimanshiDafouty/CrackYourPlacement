class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int mid =0;
        int high=n-1;
        int low= 0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;

            }
        }

        
    }
}
