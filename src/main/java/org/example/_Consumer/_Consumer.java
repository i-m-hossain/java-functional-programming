package org.example._Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "9999"));
        greetCustomer.accept(new Customer("imran", "8888"));
        greetCustomerBi.accept(new Customer("imran", "8888"), " thanks for registering ");
    }
//    Functional interface
    static Consumer<Customer> greetCustomer = customer->System.out.println("hello "+ customer.customerName+ " thanks for registering phone number "+ customer.customerPhoneNumber);
    static  BiConsumer<Customer, String> greetCustomerBi = (customer, msg)-> System.out.println("hello "+ customer.customerName+ msg + customer.customerPhoneNumber);

    //    normal java method
    static void greetCustomer(Customer customer){
        System.out.println("hello "+ customer.customerName+ " thanks for registering phone number "+ customer.customerPhoneNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;
        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
