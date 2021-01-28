package com.corejava;

import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

class Person implements  Comparable<Person>{
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p) {
        if(weight > p.weight){
            return 1;
        }else if(weight < p.weight){
            return -1;
        }else{
            if(height > p.height){
                return 1;
            }else if(height< p.height){
                return -1;
            }else {
                return 0;
            }
        }
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<Person>();
        Person p1 = new Person("mukesh", 182, 70);
        Person p2 = new Person("mukesh1", 184, 70);
        Person p3 = new Person("mukesh2", 183, 70);
        Person p4 = new Person("mukesh3", 185, 70);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for(Person p: persons ){
            System.out.println(p.getName()+ ": Height :"+ p.getHeight() + " weight: "+ p.getWeight());
        }

    }
}

