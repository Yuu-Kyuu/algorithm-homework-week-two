package com.algorithm.homework.weektwo.p560;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>(nums.length);
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().subarraySum(new int[]{1, -1, 0}, 0));
    }
}
