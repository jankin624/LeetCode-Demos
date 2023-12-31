package com.liuqingche.leetcodedemos;

public class SumOfTwoNumbers {
    /*给定一个整数数组和一个整数目标值
     * 找出该数组中和为目标值的两个整数，并返回相应的数组下表
     * 数组中同一个元素不能重复出现*/
    public int[] twoSum(int[] arr, int target) {
        for (int a = 0; a < arr.length; ++a) {
            for (int b = a + 1; b < arr.length; ++b) {
                if (arr[a] + arr[b] == target) {
                    int[] result = new int[2];
                    result[0] = a;
                    result[1] = b;
                    return result;
                }
            }
        }
        return new int[0];
    }
}
