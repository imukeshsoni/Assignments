package com.example.demo.Question1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Address address = (Address) context.getBean("address");

        Customer customer = new Customer();
        customer.setAddress(address);
        System.out.println("Customer Details: \nCustomer name: " + customer.getCustomerName() + "\n" +
                "Customer Id: " + customer.getCustomerId() + "\n" +
                "Customer Address: "+ customer.getAddress() + "\n" + "" +
                "Customer Contact: " + customer.getCustomerContact());
    }
}
