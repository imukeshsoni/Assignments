package com.corejava;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        int size = max - min;
        int[] ans = new int[4];
        for(int i=min, j=0;i<=max;i++){
            if(isArmstrong(i)) {
                ans[j] = i;
                j++;
            }
        }
        return ans;
    }
    boolean isArmstrong(int num){
        int n = num;
        int rem,sum=0;
        for(int i=0;n>0;n/=10){
            rem = n%10;
            sum += rem*rem*rem;
        }
        return sum == num;
    }

}

public class Assignment1Q2 {
    public static void main (String [] args) {

        int min = 100;int max = 999;
        ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
    }
}