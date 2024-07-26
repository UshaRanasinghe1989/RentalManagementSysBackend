package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping()
    List<Customer> retrieve(){
        return service.retrieve();
    }

    @PutMapping()
    Customer update(@RequestBody Customer customer){
        return service.update(customer);
    }

    @DeleteMapping()
    void delete(@RequestBody Customer customer){
        service.delete(customer);
    }

    @GetMapping("/{customerName}")
    Customer findByCustomerName(@PathVariable String customerName){
        return service.findByCustomerName(customerName);
    }
}
