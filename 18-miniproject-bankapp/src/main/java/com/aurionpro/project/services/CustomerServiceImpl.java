package com.aurionpro.project.services;

import com.aurionpro.project.dto.CustomerDto;
import com.aurionpro.project.entities.Customer;
import com.aurionpro.project.entities.User;
import com.aurionpro.project.exceptions.ValidationException;
import com.aurionpro.project.repositories.CustomerRepository;
import com.aurionpro.project.repositories.UserRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
   
    @Autowired
    private UserRepository userRepository;

   

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        
      
        Customer customer = toCustomerMapper(customerDto);

       
        Customer savedCustomer = customerRepository.save(customer);


        return toCustomerDtoMapper(savedCustomer);
    }

//    private void validateCustomerDto(CustomerDto customerDto) {
//        if (customerDto.getFirstName() == null || customerDto.getFirstName().trim().isEmpty()) {
//            throw new ValidationException("First name is mandatory");
//        }
//        if (customerDto.getLastName() == null || customerDto.getLastName().trim().isEmpty()) {
//            throw new ValidationException("Last name is mandatory");
//        }
//        if (customerDto.getEmail() == null || customerDto.getEmail().trim().isEmpty()) {
//            throw new ValidationException("Email is mandatory");
//        }
//        if (customerDto.getPhone() == null || customerDto.getPhone().trim().isEmpty()) {
//            throw new ValidationException("Phone number is mandatory");
//        }
//        if (customerDto.getAddress() == null || customerDto.getAddress().trim().isEmpty()) {
//            throw new ValidationException("Address is mandatory");
//        }
//        if (customerDto.getPassword() == null || customerDto.getPassword().trim().isEmpty()) {
//            throw new ValidationException("Password is mandatory");
//        }
//    }

    private Customer toCustomerMapper(CustomerDto customerDto) {
        Customer customer = new Customer();
//        customer.setFirstName(customerDto.getFirstName());
//       
//        customer.setLastName(customerDto.getLastName());
//        customer.setEmail(customerDto.getEmail());
//        customer.setPhone(customerDto.getPhone());
//        customer.setAddress(customerDto.getAddress());
        
        return customer;
    }

    private CustomerDto toCustomerDtoMapper(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
//        customerDto.setFirstName(customer.getFirstName());
//      
//        customerDto.setLastName(customer.getLastName());
//        customerDto.setEmail(customer.getEmail());
//        customerDto.setPhone(customer.getPhone());
//        customerDto.setAddress(customer.getAddress());
//       
        return customerDto;
    }
    
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    
    @Override
    public List<Customer> findCustomerByName(String name) {
        return customerRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(name, name);
    }
    
    @Override
    public void deleteCustomerById(int customerId) {
        if (!customerRepository.existsById(customerId)) {
            throw new ValidationException("Customer with ID not found");
        }
        customerRepository.deleteById(customerId);
    }

	
}
