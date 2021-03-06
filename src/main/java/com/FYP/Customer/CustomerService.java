package com.FYP.Customer;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    CustomerDTO save(CustomerRequest request);
    Iterable<Customer> findAll();
    CustomerDTO update(String id,CustomerRequest request);
    CustomerDTO delete(String id);
    CustomerDTO findById(String id);
    LoginDTO login(LoginRequest request);
}
