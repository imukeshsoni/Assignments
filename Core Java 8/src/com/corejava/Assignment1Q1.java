package com.corejava;


class ArmstrongOrNot{
    public boolean armstrongCheck(int num){
        int n = num;
        int rem,sum =0;
        for(int i=0;n>0;n/=10){
            rem = n%10;
            sum += rem*rem*rem;
        }
        return sum == num;
    }
}

public class Assignment1Q1 {
    public static void main(String[] args) {
        ArmstrongOrNot armstrongOrNot = new ArmstrongOrNot();
        int num = 371;
        System.out.println(num + " is armstrong : "+armstrongOrNot.armstrongCheck(num));
    }
}
