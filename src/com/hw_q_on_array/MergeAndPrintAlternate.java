package com.hw_q_on_array;

public class MergeAndPrintAlternate {
    private int[] arr1;
    private int[] arr2;

    public MergeAndPrintAlternate(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public int[] mergeArrays() {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public void printAlternate() {
        int[] merged = mergeArrays();

        for (int i = 0; i < merged.length; i++) {
            if (i % 2 == 0) {
                System.out.print(merged[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8, 10};

        MergeAndPrintAlternate merger = new MergeAndPrintAlternate(arr1, arr2);
        merger.printAlternate();
    }
}
