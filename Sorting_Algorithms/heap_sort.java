package Sorting_Algorithms;

import java.util.Arrays;

public class heap_sort {

    //by creating min or max heap
    //ordering the elements in array in which root element represents the min or max of the array
    //main operation here is build a heap, from array and delete root element repeatedly and insert them into sorted part
    //time complexity O(n log n)
    //space complexity O(1)
    //pick largerst elemet and push to end
    //swap(0th and last)
    //heapify(0th)

    static void heap_sort(int arr[]){
        //build maxheap

        int n=arr.length;
        for(int i=n/2-1;i>=0;i--)
            heapify(arr,i,n);
        //push largest to end
        for(int i=n-1;i>=0;i--){
            int t=arr[0];
            arr[0]=arr[i];
            arr[i]=t;
            heapify(arr,0,i);
            
        }
    }

    private static void heapify(int arr[],int i, int n) {
        int max=i;
        int left=2*i+1,right=2*i+2;
        if(left<n && arr[max]<arr[left])
            max=left;
        if(right<n && arr[max]<arr[right])
            max=right;
        if(max!=i){
            int t=arr[i];
            arr[i]=arr[max];
            arr[max]=t;
            heapify(arr,max,n);
        }
    }

    public static void main(String[] args) {
        int arr[]={4,1,2,7};
        heap_sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
