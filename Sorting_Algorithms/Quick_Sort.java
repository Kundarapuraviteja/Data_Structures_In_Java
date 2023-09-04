package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {

    //faster among all algorithms
    //follows divide and conquer approach
    //time complexity O(nlog(n))
    //Space Complexity	O(n*logn)
    //first we pick a pivot element and rearrange into two subarrays as like left side of pivot will be less than equal to pivot and along right is greater than or equal to pivot element
    // sort the sub-arrays recursively after that combine sorted array
    // chosing the pivot can be our wish but it is preferable to chose right most or left most.


    public static int division(int st,int end,int arr[]){


        int i=st-1;
       // System.out.println("st : "+st+" i :"+i);
        //end element as pivot
        int p=arr[end];
        for(int j=st;j<end;j++){
            if(arr[j]<p){
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;

            }
        }
        //here it will swap with just greater element than pivot with pivot upto "i" the elements are less than i
        //after i hence we take i+1 which is greater than p which is correct position for p hence swap it.
        int t=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=t;
       // System.out.println(Arrays.toString(arr));
        return i+1;
    }

    public static void quicksort(int st,int end,int arr[]){
        if(st<end){
            int p=division(st,end,arr);
            System.out.println("p: "+p);
            quicksort(st,p-1,arr);
            quicksort(p+1,end,arr);
        }
    }


    public static void main(String[] args) {
        //manual input
       // int arr[]={24,9,7,25,2,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        //before sorting
        System.out.println("before sorting: "+Arrays.toString(arr));

        //after sorting
        quicksort(0,arr.length-1,arr);
        System.out.println(" after sorting : "+Arrays.toString(arr));

    }


}
