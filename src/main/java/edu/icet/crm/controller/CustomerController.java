package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    @PostMapping()
    void persist(@RequestBody Customer customer){
        Customer addCustomer = Customer.builder()
                .customerName(customer.getCustomerName())
                .city(customer.getCity())
                .contactNo(customer.getContactNo())
                .build();
        log.info(addCustomer.toString());
    }
}
