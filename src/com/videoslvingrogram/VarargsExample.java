package com.videoslvingrogram;

public class VarargsExample {
    public static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3)); 
        System.out.println(sum(4, 5, 6, 7, 8)); 
        System.out.println(sum(10)); 
        System.out.println(sum(2,3,4,5,6,7,8,9,9,87,6));
    }

}
