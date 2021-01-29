package com.corejava.Assignment1;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        int size = 15;
        boolean ans = false;
        for(int i=0, j=size-1;i!=j;++i,--j){
            if(arr[i] == toCheckValue || arr[j] == toCheckValue) ans = true;
        }
        return ans;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
    }
}
