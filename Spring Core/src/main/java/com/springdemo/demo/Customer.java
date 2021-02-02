package com.springdemo.demo;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int customerContact;

   // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Address address;
    Customer(){
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("spring.xml");
        context.refresh();
        Address address = (Address) context.getBean("address");
    }
    public static void main(String[] args) {

    }

    public String getCustomerAddress(){
        String address = "Street : " + this.address.getStreet() + "City : " +
                this.address.getCity() + "State : "+ this.address.getState() + "ZIP :"+ this.address.getZip();
        return address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(int customerContact) {
        this.customerContact = customerContact;
    }
}
