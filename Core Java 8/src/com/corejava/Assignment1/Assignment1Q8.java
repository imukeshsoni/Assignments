package com.corejava.Assignment1;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort bubbleSort = new BubbleSort();
        arr = bubbleSort.bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
