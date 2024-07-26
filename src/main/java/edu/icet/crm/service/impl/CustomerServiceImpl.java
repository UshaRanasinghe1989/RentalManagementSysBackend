package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.model.Customer;
import edu.icet.crm.repository.CustomerRepository;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final ObjectMapper mapper;
    @Override
    public Customer persist(Customer customer) {
        CustomerEntity savedObj = repository.save(mapper.convertValue(customer, CustomerEntity.class));
        return mapper.convertValue(savedObj, Customer.class);
    }

    @Override
    public List<Customer> retrieve() {
        Iterable<CustomerEntity> all = repository.findAll();
        List<Customer> customerList = new ArrayList<>();

        for (CustomerEntity entity:all){
            customerList.add(mapper.convertValue(entity, Customer.class));
        }
        return customerList;
    }

    @Override
    public Customer update(Customer customer) {
        Optional<CustomerEntity> byId = repository.findById(customer.getId());

        CustomerEntity entity = null;
        if (byId.isPresent()) {
            entity = repository.save(mapper.convertValue(customer, CustomerEntity.class));
        }
        return mapper.convertValue(entity, Customer.class);
    }
}
