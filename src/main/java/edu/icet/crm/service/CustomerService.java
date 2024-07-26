package edu.icet.crm.service;

import edu.icet.crm.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer persist(Customer addCustomer);

    List<Customer> retrieve();

    Customer update(Customer updateCustomer);

    void delete(Customer customer);

    Customer findByCustomerName(String customerName);
}
