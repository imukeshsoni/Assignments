package com.springdemo.demo;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("spring.xml");
        context.refresh();

        Customer customer = (Customer) context.getBean("customer");
        System.out.println("Customer Details: \nCustomer name: " + customer.getCustomerName() + "\n" +
                "Customer Id: " + customer.getCustomerId() + "\n" +
                "Customer Address: "+ customer.getCustomerAddress() + "\n" + "" +
                "Customer Contact: " + customer.getCustomerContact());
    }
}
