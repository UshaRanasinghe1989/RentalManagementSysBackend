package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerService service;

    @PostMapping()
    Customer persist(@RequestBody Customer customer){
        Customer addCustomer = Customer.builder()
                .customerName(customer.getCustomerName())
                .city(customer.getCity())
                .contactNo(customer.getContactNo())
                .build();
        return service.persist(addCustomer);
    }
}
