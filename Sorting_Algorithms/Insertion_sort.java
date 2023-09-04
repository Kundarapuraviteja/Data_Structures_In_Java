package Sorting_Algorithms;

import java.util.Arrays;

public class Insertion_sort {

    //we take 1st element and think the array with us is sorted and try to arranege elements
    //pick next element and compare it with elemts in sorted arrays.
    //if element in sorted array is smaller than current element iterate to next.
    //else shift greater elemtns to right of the array and insert value
    //approach is we take an element and iterate through the sorted array
    //time complexity O(n2)
    //space complexity O(1) for an extra variable we are taking as key


    static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i]; //extra variable
            while(j>=0 && key<=arr[j]){
                //move elements forward from their current position
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {

        //maual input
        int arr[]={9,8,7,5,4,1,2};
        System.out.println("before sorting: "+Arrays.toString(arr));
        insertion_sort(arr);
        System.out.println("after sorting: "+ Arrays.toString(arr));
    }


}
