package Sorting_Algorithms;

import java.util.Arrays;

public class shell_sort {


    //this is extended version or similar  to insertion sort
    //comparison and in-place sorting algo...
    //it sorts elements far away from each other then subsequently reduces gap b/w them
    //sequence we follow is n/2,n/4,n/8 ...................... 1
    //first it will compare 0 and element at n/2 index then follow it for corresponding element and gap will be changed to n/4,n/8......1
    //time complexity  	O(n*logn)
    //Space Complexity	O(1)



    static void shell_sort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>0;i/=2){
            for(int j=i;j<n;j++){
                for(int k=j-i;k>=0;k-=i)
                    if(arr[k+i]>arr[k])
                        break;
                else{
                    int t=arr[k+i];
                    arr[k+i]=arr[k];
                    arr[k]=t;
                    }
            }
        }

    }

    public static void main(String[] args) {
        int arr[]= {10,9,5,4,2,1,3,6};
        shell_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
