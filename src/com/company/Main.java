package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,6,5,3,4,7,8,9};
        int target = 12;
        int[] sol = twoSum(a,target);
        System.out.println(Arrays.toString(sol));
    }

    public static int[] twoSum(int[] nums, int target){

        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer val = map.get(target-nums[i]);
            if(val == null){
                map.put(nums[i],i);
            }else{
                arr[0] = val ;
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
