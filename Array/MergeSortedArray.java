class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0 ;i<n ;i++)
        // {
        //     nums1[m+i]=nums2[i];  // Copy on nth
        // }
        // Arrays.sort(nums1);  //sort the array

        //Approach-2
        int left=m-1;
        int right=n-1;
        int index=(m+n)-1;
        while(index>=0)
        {
            if(left>=0 && right>=0)
            {
                if(nums1[left]>nums2[right])
                {
                    nums1[index]=nums1[left];
                    left--;
                }
                else
                {
                    nums1[index]=nums2[right];
                    right--;
                }
                
            }
            // else if(left>=0)
            // {
            //     nums1[index]=nums1[left];
            //     left--;

            // }
            else if(right>=0)
            {
                nums1[index]=nums2[right];
                right--;

            }
            index--;
        }

        

        
    }
}
