package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AddressTest {

    @Test
    public void testingAddress(){
        Customer customer = new Customer();
        Address address = new Address("Bank Street", "California", "CA", "United States", 54003);
        customer.setAddress(address);
        String expected = address.toString();
        Address actual = customer.getAddress();
        assertEquals(expected , actual.toString() );
    }

}
