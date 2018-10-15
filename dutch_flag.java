
    //Input: [2,0,2,1,1,0]
    //Output: [0,0,1,1,2,2]     
    public void sortColors(int[] nums) {
        int small=0, mid =0, large = nums.length, temp=-1;
        while(mid<large){
            if(nums[mid]==1){
                mid++;
            } else if(nums[mid]>1){
                temp = nums[mid];
                nums[mid] = nums[--large];
                nums[large] = temp;
            } else{
                temp = nums[mid];
                nums[mid++] = nums[small];
                nums[small++] = temp;
            }
        }
    }
