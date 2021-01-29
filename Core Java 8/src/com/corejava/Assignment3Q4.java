package com.corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return "DateClass{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        for(Map.Entry e: dob.entrySet()){
            if(e.getValue() == employeeName){

            }
            System.out.println("Key :"+e.getKey().toString() + " Value "+ e.getValue() );
        }
    return "Nothing";
    }
    public static void main(String[] args) {
        Assignment3Q4 obj = new Assignment3Q4();


        DateClass dob = new DateClass(21,01,1998);
        DateClass dob1 = new DateClass(21,01,1999);
        DateClass dob2 = new DateClass(31,03,1998);
        DateClass dob3 = new DateClass(11,12,1997);
        HashMap<DateClass, String> map = new HashMap<>();
        map.put(dob, "vicky1");
        map.put(dob1, "vicky1");
        map.put(dob2, "vicky2");
        map.put(dob3, "vicky3");

        System.out.println(obj.getEmployee(map, "vicky1"));


    }
}
