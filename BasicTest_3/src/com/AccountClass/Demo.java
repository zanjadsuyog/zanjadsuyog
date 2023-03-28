package com.AccountClass;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading the input values
        int n = input.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = input.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(t);

        // Initializing the total waiting time and the number of satisfied people
        long waitingTime = 0;
        int satisfiedCount = 0;

        // Calculating the waiting time and the number of satisfied people
        for (int i = 0; i < n; i++) {
            if (waitingTime <= t[i]) {
                waitingTime += t[i];
                satisfiedCount++;
            }
        }

        // Printing the result
        System.out.println(satisfiedCount);
    }
}
