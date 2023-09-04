package Sorting_Algorithms;

import java.util.Scanner;

public class bubble_Sort {


    //main principle repeatedly swapping of adjacent elements util they are not in order
    // time complexity O(n2)
    static void Bubble(int arr[]){

        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)

                //checking the condition whether if corresponding element is greater then swap it else skip
                if(arr[i]>arr[j]){
                    int k=arr[i];
                    //space complexity is O(1) because an extra variable is being used
                    arr[i]=arr[j];
                    arr[j]=k;
                }
    }

    //printing data in  array
    static void Display(int arr[]){
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //manual input
        //int arr[]={2,3,4,1,5};
        System.out.println("enter size of the array : ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("before sorting the array");
        Display(arr);
        Bubble(arr);
        System.out.println("after sorting the array");
        Display(arr);
    }


}
