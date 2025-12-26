package com.sort;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr={-1862,-584,25,849,65,95,192229};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last =arr.length-i-1;
            int max= getMaxIndex(arr,0,last);
            swap(arr,max,last);
            }

        }
        static int getMaxIndex(int [] arr,int start, int end){
        int max=start;
            for (int i = start; i <= end; i++) {
                if (arr[max] < arr[i]){
                        max=i;
                }
            }
            return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
