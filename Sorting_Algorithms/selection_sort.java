package Sorting_Algorithms;

import java.util.Arrays;

public class selection_sort {

    // smallest value among the unsorted elements in array is selected in every pass and inserted to position into the array.
    //array is sorted into two parts first is sorted and another is unsorted part
    // time complexity O(n2)
    //Space Complexity O(1)

    static void Selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int low=i;
            //iterating array to find smallest element
            for(int j=i+1;j< arr.length;j++){
                //assign index to low after verifying condition
                if(arr[j]<arr[low])
                    low=j;
            }
            //swap the returned index with ith element which is exact position in the array
            int t=arr[low];
            arr[low]=arr[i];
            arr[i]=t;
        }
    }

    public static void main(String[] args) {


        int arr[]= {9,2,1,6,7,8};
        System.out.println("before sorting: "+ Arrays.toString(arr));
        Selection_sort(arr);
        System.out.println("after sorting: "+Arrays.toString(arr));



    }


}
