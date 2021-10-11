package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        int[] resultArray=new int[2];
        int length=nums.length;
        boolean flag=false;
        for(int i = 0; i<length-1 && !flag; i++){
            for(int j=i+1;j<length && !flag;j++)
                if(nums[i]+nums[j]==target) {
                    resultArray[0]=nums[i];
                    resultArray[1]=nums[j];
                    flag=true;
                }
            if (nums[i]>=target)
                flag=true;
        }
        return resultArray;
    }
}
