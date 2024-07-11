package com.bank.sorting_Prac;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {7,2,4,6,1,9,-1};
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void mergeSort(int[]arr){
        if (arr.length<2)return;
        int mid = arr.length/2;

        int[] arrLeft = new int[mid];
        for (int i = 0; i < mid; i++) {
            arrLeft[i]=arr[i];
        }
        int[] arrRight = new int[arr.length-mid];
        for (int i = mid; i < arr.length; i++) {
            arrRight[i-mid]=arr[i];
        }
        mergeSort(arrLeft);
        mergeSort(arrRight);
        merge(arrLeft,arrRight,arr);
    }
    public static void merge(int[] left, int[]right, int[]result){
        int i =0, j=0,k=0;
        while (i<left.length && j<right.length){
            if (left[i]<=right[j])result[k++] = left[i++];
            else result[k++]=right[j++];
        }
        while (i<left.length){
            result[k++]=left[i++];
        }
        while (j<right.length){
            result[k++]=right[j++];
        }

    }
    // void merge sort arr if less 2 return
    // 2. find MD of Arr divide arr.ling /2
    // 3. arrL new [MD] L < MD
    // 4. arrR new [arr.ling - MD] R < arr.ling
    // 5. MS = LA; MS = RA 6. Merge AL, AR, Aresult
    // arr L   M    R arrNewL = [M] arrR = arr - M


        // I 0; 0; 0;
        // R true i < l and j < R
        // A if Arg1[i] <= arg2[j]
        // C [k++] = arg1[i] else = arg2[j]
        // R true Arg1[i] same do for 2[j] compl C count result[k+] = to arg1[i]

    }

