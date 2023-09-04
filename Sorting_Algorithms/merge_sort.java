package Sorting_Algorithms;

import java.util.Arrays;

public class merge_sort {
    //follows divide and conquer technique
    // first divide the array into two equal halves and merges as sorted halves
    //sub-lists are divided again and again into halves until array can't be divided.
    //we check and combine the array as sorted as above breaking down to combining
    //time complexity O(n*logn)
    //Space Complexity	O(n)

    private static void merging(int[] arr, int beg, int mid, int end) {
        //size of left sub array or 1st half of the array
        int n1=mid-beg+1;
        //size of right sub array or 2nd half of the array
        int n2=end-mid;
        int leftsubarray[]=new int[n1];
        int rightsubarray[]=new int[n2];

        for(int i=0;i<n1;i++)
            leftsubarray[i]=arr[i+beg];
        for(int i=0;i<n2;i++)
            rightsubarray[i]=arr[mid+i+1];

        int i=0,j=0,k=beg;
        //i->intital index of 1st sub array
        // j->intial index of 2nd suub array
        // k->initial index of mergerd subarray

//        checking the corresponding arrays and merging to final array
        while(i<n1 && j<n2){
            if(leftsubarray[i]<=rightsubarray[j])
                arr[k++]=leftsubarray[i++];
            else
                arr[k++]=rightsubarray[j++];

        }

//        after condition is met we will simply add remaining elemtns in the subarrays
// as leftsubarray are lower than rightsubarray elemts by value we add all elements in final array. leftsubarray 1st then rightsubarray
        while(i<n1)
            arr[k++]=leftsubarray[i++];
        while(j<n2)
            arr[k++]=rightsubarray[j++];



    }


    static void merge_sort(int arr[],int beg,int end){
        if(beg<end){
            int mid=(beg+end)/2;
            merge_sort(arr,beg,mid);
            merge_sort(arr,mid+1,end);
            merging(arr,beg,mid,end);
        }
    }



    public static void main(String[] args) {
        int arr[]= {10,9,3,2,1,6,7,8};
        System.out.println("before sorting: "+ Arrays.toString(arr));
        merge_sort(arr,0,arr.length-1);
        System.out.println("after sorting: "+Arrays.toString(arr));
    }
}
