package com.corejava.Assignment1;

import java.lang.Math;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        return (principalAmount * interestRate * time)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double r = interestRate / 100;
        return principalAmount * Math.pow(1 + r, time) - principalAmount;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {}
}