package org.example.algorithms;

import java.util.HashMap;

public class TwoSum {
    public static int[] sumTwoNumbersAndReturnTheirIndices(int[] nums, int target) {

        int partnerIndex = 0;
        int currentIndex = 0;

        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int neededNumber = target - nums[i];
            if (numToIndex.containsKey(neededNumber)) {
                partnerIndex = numToIndex.get(neededNumber);
                currentIndex = i;
                break;
            } else {
                numToIndex.put(nums[i], i);
            }
        }

        return new int[]{
                partnerIndex,
                currentIndex
        };
    }
}
