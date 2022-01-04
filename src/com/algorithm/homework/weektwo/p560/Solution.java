package com.algorithm.homework.weektwo.p560;

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0] == k ? 1 : 0;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                result++;
            }

            int currentTemp = nums[i];
            for (int j = 1; j < nums.length - i; j++) {
                currentTemp = currentTemp + nums[i + j];
                if (currentTemp == k) {
                    result++;
                }

            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().subarraySum(new int[]{1, -1, 0}, 0));
    }
}
